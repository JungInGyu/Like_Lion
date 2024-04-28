package day16.Test;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExam {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(12345);
             Socket socket = serverSocket.accept();
        ){


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class ClientThread extends Thread{
    private Socket socket;
    public ClientThread(Socket socket){
        this.socket = socket;
    }
    @Override
    public void run() {

    }
}