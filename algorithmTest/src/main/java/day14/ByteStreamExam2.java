package day14;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamExam2 {
    public static void main(String[] args) {
        //파일로 부터 읽어서 -- 입력 통로가 필요
        //파일에 쓴다 -- 출력 통로가 필요

        //try with Resource
        try(FileInputStream input = new FileInputStream("src/main/java/day14/ReadFile.java");
            FileOutputStream output = new FileOutputStream("outputFile.txt");) {

            int c;
            while ((c=input.read()) != -1){
                output.write(c);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
