package com.example.day01.day03;

public class ForExam1 {
    public static void main(String[] args){
        for (int i=0; i < 10; i++){
            System.out.println(i);
        }

        int sum = 0;
        for (int j=1; j <= 100; j++){
            if (j % 2 == 0){
                sum += j;
            }
        }
        System.out.println(sum);
    }
}
