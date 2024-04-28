package ChatProject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

class ChatRoomManager {
    Map<Integer, ChatRoom> chatRooms;
    private int roomNumber = 1;

    public int getRoomNumber() {
        return roomNumber;
    }

    public ChatRoomManager() {
        this.chatRooms = new HashMap<>();
    }

    public void createChatRoom() {
        int roomId = roomNumber++;
        chatRooms.put(roomId, new ChatRoom(roomId));
        System.out.println(roomId + "번 방이 생성 되었습니다.");
    }

    public void listChatRooms() {
        System.out.println("현재 생성된 채팅방 목록: ");
        for (int roomID : chatRooms.keySet()) {
            System.out.println("방 번호:\t" + roomID);
        }
    }

    public ChatRoom getChatRoom(int roomId) {
        return chatRooms.get(roomId);
    }


    public void removeChatRoom(int roomId) {
        chatRooms.remove(roomId);
        System.out.println(roomId + "번 방이 삭제되었습니다.");
    }
}

class ChatRoom {
    private int roomId;
    private Map<String, PrintWriter> users;
    private String nickName;

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getRoomId() {
        return roomId;
    }

    public ChatRoom(int roomId) {
        this.roomId = roomId;
        this.users = new HashMap<>();
    }

    public Map<String, PrintWriter> getUsers() {
        return users;
    }

    public void addUser(String user, PrintWriter out) {
        users.put(user, out);
        System.out.println(user + "님이 방 " + roomId + "에 입장하셨습니다.");
    }

    public void removeUser(String user) {
        users.remove(user);
        System.out.println(user + "님이 방 " + roomId + "에서 퇴장하셨습니다.");
    }

    public void broadcastMessage(String message, String sender) {
        for (Map.Entry<String, PrintWriter> entry : users.entrySet()) {
            String user = entry.getKey();
            PrintWriter out = entry.getValue();
            if (!user.equals(sender)) {
                out.println(sender + ": " + message);
            }
        }
    }
}

public class ServerMessageReader implements Runnable {
    private BufferedReader in;
    private ChatRoomManager chatRoomManager;
    private Map<String,Integer> clientRooms;
    public static void main(String[] args) {
        ServerMessageReader server = new ServerMessageReader();
        server.start();
    }

    public ServerMessageReader() {
        this.chatRoomManager = new ChatRoomManager();
        this.clientRooms = new HashMap<>();
    }

    public void start() {
        try (ServerSocket serverSocket = new ServerSocket(12345);) {
            System.out.println("서버가 준비되었습니다.");
            Map<String, PrintWriter> chatClients = new HashMap<>();
            while (true) {
                Socket socket = serverSocket.accept();
                String clientAddress = socket.getInetAddress().getHostAddress();
                System.out.println("사용자 " + clientAddress + "가 로비에 접속했습니다.");
                new chatThread(socket, chatClients).start();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ServerMessageReader(BufferedReader in) {
        this.in = in;
    }

    @Override
    public void run() {
        try {
            String serverLine;
            while ((serverLine = in.readLine()) != null) {
                System.out.println(serverLine); // 서버로부터 받은 메시지를 출력
            }
        } catch (IOException e) {
            System.out.println("Server connection was closed.");
        }
    }

    private class chatThread extends Thread {
        private Socket socket;
        private Map<String, PrintWriter> chatClients;
        private Map<String, Integer> clientRooms;
        private String nickname;


        public chatThread(Socket socket, Map<String, PrintWriter> chatClients) {
            this.socket = socket;
            this.chatClients = chatClients;
            this.clientRooms = new HashMap<>();
        }

        @Override
        public void run() {
            try (BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                 PrintWriter out = new PrintWriter(socket.getOutputStream(), true)) {

                // 사용자 닉네임
                nickname = in.readLine();
                System.out.println(nickname + " 닉네임의 사용자가 연결했습니다.");

                clientRooms.put(nickname, 0);
                // 새로 연결된 클라이언트 공지
                synchronized (chatClients) {
                    for (PrintWriter client : chatClients.values()) {
                        client.println(nickname + " 님이 로비에 입장 하셨습니다.");
                    }
                    chatClients.put(nickname, out);
                }

                // 메시지를 다른 사용자에게 전송
                String message;
                while ((message = in.readLine()) != null) {
                    if ("/bye".equals(message)) {
                        break;
                    } else if ("/list".equals(message)) {
                        chatRoomManager.listChatRooms();
                    } else if ("/create".equals(message)) {
                        chatRoomManager.createChatRoom();
                        ChatRoom newRoom = chatRoomManager.getChatRoom(chatRoomManager.getRoomNumber() - 1);
                        newRoom.addUser(nickname, out);
                        int roomId = chatRoomManager.getRoomNumber() -1;
                        clientRooms.put(nickname, roomId);
                    } else if (message.startsWith("/join")) {
                        try {
                            int roomId = Integer.parseInt(message.replace(" ","").substring(5));
                            ChatRoom chatRoom = chatRoomManager.getChatRoom(roomId);
                            if (chatRoom != null) {
                                chatRoom.addUser(nickname, out);
                                clientRooms.put(nickname, roomId);
                            } else {
                                out.println("존재하지 않는 방입니다.");
                            }
                        }catch (Exception e){
                            e.printStackTrace();
                        }

                    } else if ("/exit".equals(message)) {
                        try{
                            removeUserFromRoom(nickname);
                            clientRooms.put(nickname, 0);
                        } catch (Exception e){
                            System.out.println("현재 로비에 있습니다. \n 종료를 원하시면 /bye를 입력해주세요.");
                        }

                    } else {
                        sendMessageToRoom(message, nickname);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                synchronized (chatClients) {
                    chatClients.remove(nickname);
                    for (PrintWriter client : chatClients.values()) {
                        client.println(nickname + "닉네임의 사용자가 연결을 끊었습니다.");
                    }
                }
            }
        }
        private void removeUserFromRoom(String nickname){
            for (ChatRoom room : chatRoomManager.chatRooms.values()) {
                if(room.getUsers().containsKey(nickname)){
                    room.removeUser(nickname);
                    if (room.getUsers().isEmpty()){
                        chatRoomManager.removeChatRoom(room.getRoomId());
                    }
                    break;
                }
            }
        }

        private void sendMessageToRoom(String message, String nickname) {
            synchronized (chatClients) {
                int roomId = clientRooms.getOrDefault(nickname,0);
                if (roomId == 0){
                    for (PrintWriter client : chatClients.values()){
                        client.println(nickname+ ": " + message);
                    }
                }else {
                    ChatRoom chatRoom = chatRoomManager.getChatRoom(roomId);
                    if (chatRoom != null){
                        chatRoom.broadcastMessage(message, nickname);
                    }
                }
            }
        }
    }
}
