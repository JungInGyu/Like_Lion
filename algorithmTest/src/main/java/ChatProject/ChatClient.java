package ChatProject;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class ChatClient {
    public static void main(String[] args) {
        String hostName = "localhost"; // 서버가 실행 중인 호스트의 이름 또는 IP 주소
        int portNumber = 12345; // 서버와 동일한 포트 번호 사용

        Socket socket = null;
        PrintWriter out = null;
        BufferedReader in = null;
        try{
            socket = new Socket(hostName, portNumber);
            out = new PrintWriter(socket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            Scanner stdIn = new Scanner(System.in);

            System.out.println("서버에 연결되었습니다.");
            printCommandList();

            System.out.print("Enter your nickname: ");
            String nickname = stdIn.nextLine();
            out.println(nickname); // 서버에 닉네임을 전송

            // 서버로부터 메시지를 읽어 화면에 출력하는 별도의 스레드
            Thread readThread = new Thread(new ServerMessageReader(in));
            readThread.start(); // 메시지 읽기 스레드 시작

            // 사용자 입력 처리
            String userInput;
            while (true) {
                userInput = stdIn.nextLine();

                // '/bye'를 입력하면 클라이언트를 종료합니다.
                if (userInput.equals("/bye")) {
                    out.println(userInput); // 클라이언트 종료 명령어를 서버로 전송
                    break;
                } else if (userInput.equals("/list")) {
                    // 명령어 목록 요청
                    out.println(userInput);
                } else if (userInput.equals("/create")) {
                    // 채팅방 생성 요청
                    out.println(userInput);
                } else if (userInput.startsWith("/join")) {
                    // 채팅방 입장 요청
                    out.println(userInput);
                } else if(userInput.equals("/exit")){
                    out.println(userInput);
                }else {
                    // 일반 메시지 전송
                    out.println(userInput);
                }
            } // while

            // 클라이언트와 서버는 명시적으로 close를 합니다. close를 할 경우 상대방쪽의 readLine()이 null을 반환됩니다. 이 값을 이용하여 접속이 종료된 것을 알 수 있습니다.
            in.close();
            out.close();
            socket.close();

        } catch (IOException e) {
            System.out.println("Exception caught when trying to connect to " + hostName + " on port " + portNumber);
            e.printStackTrace();
        }
    }

    private static void printCommandList() {
        System.out.println("방 목록 보기 : /list");
        System.out.println("방 생성 : /create");
        System.out.println("방 입장 : /join [방번호]");
        System.out.println("방 나가기 : /exit");
        System.out.println("접속종료 : /bye");
    }
}

class ServerMessageReaders implements Runnable{
    private BufferedReader in;

    public ServerMessageReaders(BufferedReader in) {
        this.in = in;
    }

    @Override
    public void run() {
        try {
            String serverLine;
            while((serverLine = in.readLine())!= null){
                System.out.println(serverLine);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}