package day18;



public class MyFunctionalInterfaceTest2 {
    public static void main(String[] args) {
        MyFuncitonalInterface2 fi2;
        fi2 = ((int s) -> {
            int reulst = s*s*s;
            System.out.println(reulst);
        });

        fi2.method(22);
    }
}
