package day14;

import java.io.*;

public class IOExam3 {
    public static void main(String[] args) {
        //"test.txt" 파일에서 한 줄 씩 입력받아서 입력바든 문자뒤에 hi 를 추가해서 파일에 출력하는 프로그램을 작성해보세요.
        //"testhi.txt" 파일에 출력하는 프로그램을 작성해보세요.
        try(BufferedReader reader = new BufferedReader(new FileReader("test.txt"));
            FileWriter writer = new FileWriter("testhi.txt");) {
            String str;
            while ((str = reader.readLine()) != null){
                writer.write(str + " hi\n");
                System.out.println(str + " hi");
            }
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
