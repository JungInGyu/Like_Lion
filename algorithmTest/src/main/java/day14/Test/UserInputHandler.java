package day14.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class UserInputHandler {
    public List<String> getUserInput() {
        List<String> str = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             ){
            System.out.print("문자열을 입력해주세요.\t 입력을 종료하고 싶으시면 0을 입력해주세요.");
            while (true){
                String string = reader.readLine();
                if (string.equals("0")){
                    str.remove("0");
                    break;
                } else {
                    str.add(string);
                }
            }
        } catch (IOException e){
            e.printStackTrace();
        }

        return str;
    }
}
