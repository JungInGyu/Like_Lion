package com.example.day01.day03;

public class IfExam1 {
    public static void main(String[] args){

        int a = 10;

        int b = 20;
        if(a > b) {
            System.out.println("a는 b보다 큽니다.");
        } else {
            System.out.println("b는 a보다 큽니다.");
        }

        if (a % 2 == 0){
            System.out.println("a는 짝수입니다.");
        } else {
            System.out.println("a는 홀수입니다.");
        }

        int num = 10;

        int value = (num > 5) ? 20 : 30;
        System.out.println(value);
    }
}
