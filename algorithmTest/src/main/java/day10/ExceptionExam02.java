package day10;

public class ExceptionExam02 {
    public static void main(String[] args) {
        System.out.println("프로그램 시작");
        int i = Integer.parseInt(args[0]);
        try {
            System.out.println(10/i);
        } catch (Exception e) {
            System.out.println("자연수가 아닙니다.");
        }
        System.out.println("프로그램 종료");
    }
}
