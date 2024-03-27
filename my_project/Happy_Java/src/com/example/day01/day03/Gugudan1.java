package com.example.day01.day03;

import java.util.Scanner;

public class Gugudan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("단을 입력하세요");
        int dan = sc.nextInt();

        for (int i=1; i <= 9; i++){
            System.out.println(dan + " * " + i + " = " + (dan * i));
        }

        System.out.println("숫자를 입력해주세요.");
        int number = sc.nextInt();
        int j = 1;
        int temp = 0;
        while (j < number){
            if (j % 2 == 0){
                temp += j ;
            }
            j++;
        }
        System.out.println(temp);
    }
}
