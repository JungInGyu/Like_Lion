package day18;

public class FinalVariableExam {
    public static void main(String[] args) {
        final int x = 10;
        System.out.println("람다에서 파이널로 사용.");
        Runnable r = () ->{
            System.out.println("x : "+x);
        };

        r.run();

        int y = 10;
        System.out.println("람다에서 파이널로 사용.");
        Runnable r2 = () ->{
            System.out.println("y : "+y);
        };

//        y=20;
        r2.run();
    }
}
