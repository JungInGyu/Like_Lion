package ch06;

import java.util.Scanner;

public class ss {
    static void displayPattern(int n) {
        if (n > 0) {
            System.out.println("Number: " + n); // 현재 숫자 출력
            System.out.println("==="); // 구분선 출력
            displayPattern(n - 1); // 첫 번째 재귀 호출
            displayPattern(n - 2); // 두 번째 재귀 호출
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("출력할 숫자를 입력하세요: ");
        int x = stdIn.nextInt();

        displayPattern(x);
    }
}

