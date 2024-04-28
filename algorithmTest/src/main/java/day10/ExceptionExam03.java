package day10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionExam03 {
    public static void main(String[] args) throws FileNotFoundException{
        //예외종류 2가지
        // 실행시 체크하는 예외(Runtime Exception),
        // 컴파일시 체크하는 예외.   (checked Exception)

        //예외 처리방법 2가지
        //1. try-catch 으로 처리하는 방법
        //2. throws 하는 방법
//        try {
            FileInputStream fis = new FileInputStream("abc");
//        } catch (FileNotFoundException e){
//            e.printStackTrace();
//        }

        int[] iarr = null;
        iarr[0] = 10;
    }
}
