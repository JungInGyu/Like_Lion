package day18;

public class MyFunctionalInterfaceTest3 {
    public static void main(String[] args) {
        MyFunctionalInterface3 mif3;
        mif3 = (int x, int y) -> {
            int max = Math.max(x,y);
            int min = Math.min(x,y);
            System.out.println("max값은 : "+ max + " min값은 : "+min+" 입니다.");
        };
        mif3.Method(2,10);


    }
}
