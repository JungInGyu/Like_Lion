package day11;

public class StaticExam {
    int i = 10;
    static  int si = 20;

    public void m1(){
        System.out.println(i);
        System.out.println(si);
        sm();

    }

    public static void sm(){
//        System.out.println(i); 불가능 스테틱은 미리 만들어지고
//        스테틱 하지 않은것은 인스턴스화 될때 생성됨.
        System.out.println(si);
//        m1(); 불가능.
    }
}
