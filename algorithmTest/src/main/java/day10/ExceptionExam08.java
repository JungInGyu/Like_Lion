package day10;

import javax.security.auth.login.AccountNotFoundException;
import java.io.FileInputStream;

public class ExceptionExam08 {

    public static void main(String[] args) {

        try(FileInputStream fis2 = new FileInputStream("abs")) {
            //처리할 로직..
        } catch (Exception e){
            e.printStackTrace();

        }
    }
}
