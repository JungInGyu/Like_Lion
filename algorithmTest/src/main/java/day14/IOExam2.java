package day14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class IOExam2 {
    public static void main(String[] args) throws Exception {
        //키보드로부터 한줄씩 입력 받아서 콘솔에 출력하고 싶다.

        //키보드 = System.in
        //한줄씩 읽기 = BufferedReader

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        BufferedReader readerFile = new BufferedReader(new FileReader("a.txt"));

        String str = reader.readLine();

        System.out.println(str);

        System.out.println(readerFile.readLine());
    }
}
