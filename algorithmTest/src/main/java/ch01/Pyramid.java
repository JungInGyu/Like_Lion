package ch01;

import java.util.Scanner;

public class Pyramid {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        do {
            System.out.print("단을 입력해주세요: ");
            num = scanner.nextInt();
        } while (num <= 0);
            pyra(num);
    }

    public static void pyra(int number) {
        for (int i = 1; i <= number; i++) {
            if (i == number) {
                for (int j = 1; j <= i; j++) System.out.print("*  ");
            } else {
                for (int j = 1; j <= i; j++) {
                    if (j == 1){
                        System.out.print("*  ");
                    } else if (j == i){
                        System.out.print("*");
                    } else System.out.print("   ");
                }
            }
            System.out.println("");
        }
    }
}
