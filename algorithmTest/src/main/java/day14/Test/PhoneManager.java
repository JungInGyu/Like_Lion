package day14.Test;

import java.io.*;

public class PhoneManager {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileOutputStream output = new FileOutputStream("phone.txt");
             BufferedReader fileReader = new BufferedReader(new FileReader("phone.txt"))){

            for (int i=0; i < 3; i++){
                String str = "";
                System.out.print("이름: ");
                str += reader.readLine() +" ";
                System.out.print("전화번호: ");
                str += reader.readLine() +"\n";
                System.out.println();
                output.write(str.getBytes());
            }
            System.out.println("...전화번호가"+System.getProperty("user.dir")+"저장되었습니다.");
            System.out.println();
            System.out.print("전화번호가"+System.getProperty("user.dir")+"\\phone.txt의 내용은 다음과 같습니다...\n");
            String str2 = null;
            while ((str2 = fileReader.readLine()) != null){
                System.out.println(str2);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
