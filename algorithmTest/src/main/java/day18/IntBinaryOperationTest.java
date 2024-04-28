package day18;

public class IntBinaryOperationTest {
    public static void main(String[] args) {
        IntBinaryOperation test = new IntBinaryOperation() {
            @Override
            public int apply(int a, int b) {
                return 0;
            }
        };

        IntBinaryOperation test2 = (a, b) -> 0;

        IntBinaryOperation plus = (a, b) -> a + b;

        IntBinaryOperation minus = (a, b) -> (a > b) ? a - b : b - a;


        System.out.println(test.apply(1, 2));
        System.out.println(plus.apply(3, 4));
        System.out.println(minus.apply(3, 10));
        System.out.println(minus.apply(10, 7));
    }
}
