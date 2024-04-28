package day14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SystemIOExample {
    public static void main(String[] args) {
        //키보드(System.in)로부터 한 줄 입력받기 위한  IO객체를 생성해주세요
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));){
            System.out.print("문자열을 입력하세요.");
            String userInput = reader.readLine();
            System.out.println(userInput);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
