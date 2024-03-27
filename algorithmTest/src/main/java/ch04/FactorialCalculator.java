package ch04;

import java.util.Scanner;

public class FactorialCalculator {
    static int Factorial(int num){
        if (num > 0){
            return num * Factorial(num -1);
        } else {
            return 1;
        }
    }
//      재귀 함수의 원리
//    Factorial(5)를 호출하면:
//      5 * Factorial(4)를 호출합니다.
//          4 * Factorial(3)를 호출합니다.
//              3 * Factorial(2)를 호출합니다.
//                  2 * Factorial(1)를 호출합니다.
//                      1 * Factorial(0)를 호출합니다.
//                      Factorial(0)은 1을 반환합니다.
//                  따라서 1 * 1 = 1을 반환합니다.
//              따라서 2 * 1 = 2를 반환합니다.
//          따라서 3 * 2 = 6을 반환합니다.
//      따라서 4 * 6 = 24를 반환합니다.
//    따라서 5 * 24 = 120을 반환합니다.


    static int ForFactorial(int num){
        int temp =1;
        for (int i = 1; i <= num; i++){
         temp = temp * i;
        }
        return temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("팩토리얼을 구할 숫자를 입력해주세요: ");
        int num = sc.nextInt();
        System.out.println(num+"의 팩토리얼 값은 " + Factorial(num));
        System.out.println(num+"의 FOR문으로 구한 팩토리얼 값은 "+ForFactorial(num));
    }
}
