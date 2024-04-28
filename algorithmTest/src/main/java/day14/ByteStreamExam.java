package day14;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class ByteStreamExam {
    public static void main(String[] args) {
        //파일로 부터 읽어서 -- 입력 통로가 필요
        //파일에 쓴다 -- 출력 통로가 필요
        FileInputStream input = null;
        FileOutputStream output = null;

        try {
            input = new FileInputStream("src/main/java/day14/ReadFile.java");
            output = new FileOutputStream("outputFile.txt");

            int c;
            while ((c=input.read()) != -1){
                output.write(c);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (input != null){
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (output != null){
                try {
                    output.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
