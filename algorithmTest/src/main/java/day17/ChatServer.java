package day17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ChatServer {
    public static void main(String[] args) {
        //1. 서버소켓
        try (ServerSocket serverSocket = new ServerSocket(9999);) {
            System.out.println("서버가 준비 되었습니다.");
            Map<String, PrintWriter> chatClients = new HashMap<>();
            while (true) {
                //2. accept() 를 통해서 소켓을 얻어옴.
                Socket socket = serverSocket.accept();
                //Thread 이용!!
                //여러명의 클라이언트의 정보를 기억할 공간
                new ChatThread(socket, chatClients).start();
            }
        } catch (Exception e) {
            System.out.println(e);
        }


    }
}

class ChatThread extends Thread {
    //생성자를 통해서 클라이언트 소켓을 얻어옴.
    private Socket socket;
    private String id;
    private Map<String, PrintWriter> chatClients;

    PrintWriter writer;
    BufferedReader reader = null;

    public ChatThread(Socket socket, Map<String, PrintWriter> chatClients) {
        this.socket = socket;
        this.chatClients = chatClients;

        //클라이언트가 생성될 때 클라이언트로 부터 아이디를 얻어오게 하고 싶어요.
        try {
            writer = new PrintWriter(socket.getOutputStream(), true);
            reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            //Client가 접속하자마자 ID를 보낸다는 약속!!
            id = reader.readLine();
            //이때.. 모든 사용자에게 id님이 입장했다라는 정보를 알려줌.
            broadcast(id + "님이 채팅방에 입장하셨습니다.");
            System.out.println("새로운 사용자의 아이디는 " + id + "입니다.");
            //동시에 일어날 수도.. (동기화 필요)
            synchronized (chatClients) {
                chatClients.put(this.id, writer);
            }

        } catch (IOException e) {
            System.out.println(e);
        }
    }


    public void sendMsg(String msg){
        int firstSpaceIndex = msg.indexOf(" ");
        if(firstSpaceIndex ==  -1) return; // 공백이 없다면....

        int secondSpaceIndex = msg.indexOf(" ",firstSpaceIndex + 1);
        if (secondSpaceIndex == -1) return; // 두번째 공백이 없다는 것도 메시지가 잘못된거니까..

        String to = msg.substring(firstSpaceIndex +1, secondSpaceIndex);
        String message = msg.substring(secondSpaceIndex + 1);

        //to(수신자)에게 메시지 전송.
        PrintWriter pw = chatClients.get(to);
        if (pw != null){
            pw.println(id + "귓속말 : "+message);
        } else {
            System.out.println("오류 : 수신자 "+ to + "님을 찾을 수 없습니다.");
        }
    }

    @Override
    public void run() {
        //run
        //모든 클라이언트에게 전송하기 위해서 무엇을??
        //연결된 클라이언트가 메시지를 전송하면, 그 메시지를 받아서 다른 사용자들에게 보내줌..
        String msg = null;
        try {
            while ((msg = reader.readLine()) != null) {
                if ("/quit".equalsIgnoreCase(msg)) {
                    break;
                } else if (msg.indexOf("/to") == 0) {
                    sendMsg(msg);
                } else {
                    broadcast(id + " : " + msg);
                }

            }
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            synchronized (chatClients) {
                chatClients.remove(id);
            }
            broadcast(id + "님이 채팅방에서 퇴장 하셨습니다.");


            if (reader != null) {
                try {
                    reader.close();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }

            if (socket != null) {
                try {
                    socket.close();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    //전체 사용자에게 알려주는 메서드
    public void broadcast(String msg) {
        synchronized (chatClients) {
            Iterator<PrintWriter> it = chatClients.values().iterator();
            while (it.hasNext()) {
                PrintWriter out = it.next();
                try {
                    out.println(msg);
                } catch (Exception e) {
                    it.remove();    // 브로드케스트 할 수 없을때
                    e.printStackTrace();
                }
            }
        }
    }
}
