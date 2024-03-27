package ch07;

public class MathBeanRun {
    public static void main(String[] args) {
        MathBean mathBean = new MathBean();
        mathBean.printClassName();
        mathBean.printNumber(19);
        mathBean.getOne();
        mathBean.plus(4,6);
    }
}
