package day14;

import java.io.*;

public class BufferdExam {
    public static void main(String[] args) {
        //1.키보드(System.in)로부터 한줄씩 5번 입력받아 콘솔에 출력
        //2.파일에 출력하는 IO객체를 생성해주세요
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); FileOutputStream output = new FileOutputStream("result.txt");){
            int count =1;
            String str = "";
            while (true){
                if (count > 5){
                    output.write(str.getBytes());
                    break;
                } else {
                    System.out.println("문자를 입력해주세요.");
                    str += reader.readLine() + " ";
                    System.out.println(str);
                    count++;
                }
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
