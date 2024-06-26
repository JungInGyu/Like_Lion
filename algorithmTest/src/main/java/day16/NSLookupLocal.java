package day16;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class NSLookupLocal {
    public static void main(String[] args) {
        try {
            InetAddress localAddress = InetAddress.getLocalHost();
            System.out.println(localAddress.getHostName());
            System.out.println(localAddress.getHostAddress());

            System.out.println("byte[] 형식의 ip 주소 변환");
            byte[] ip = localAddress.getAddress();
            for (int i=0; i < ip.length; i++){
                System.out.println(ip[i] & 0xFF);
                if (i != ip.length - 1){
                    System.out.println(".");
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


        try {
            InetAddress address = InetAddress.getByName("www.google.com");
            System.out.println(address.getHostAddress());

            InetAddress localhost = InetAddress.getLocalHost();
            System.out.println("local host name: "+localhost.getHostName());
            System.out.println("local host address: "+localhost.getHostAddress());
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }
    }
}
