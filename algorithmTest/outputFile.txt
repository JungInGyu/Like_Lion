package day14;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ReadFile {
    public static void main(String[] args) throws Exception {
//        System.out.println(System.getProperty("user.dir")); 현재 경로를 알 수 있는 메서드
        FileInputStream input = new FileInputStream("a.txt");
        FileOutputStream output = new FileOutputStream("b.txt");
        int n;
        int count =0;
        byte[] bytes = new byte[1024];    //바이트 배열의 크기만큼 읽어서 출력하는 While문
//        while ((n = input.read(bytes)) != -1){ //1번만 실행됨
//            String str = new String(bytes);
//            System.out.println(str);
////            output.write(bytes);
//            count++;
//        }

        while ((n = input.read()) != -1){
            System.out.println((char)n);
            count++;
            output.write(bytes);
        }
        System.out.println(count);
        input.close();
        output.close();
    }
}
