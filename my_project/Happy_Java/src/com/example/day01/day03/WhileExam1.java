package com.example.day01.day03;

public class WhileExam1 {
    public static void main(String[] args){
        int num =1;
        while (num <= 10){
            if (num == 5){
                break;
            }
            System.out.println(num++);
        }
        int i = 0;
        while (i++ < 10){
            System.out.println(i);
        }
        // 1-100 까지의 짝수의 합을 구해주세요.
        int j = 1;
        int temp = 0;
        while (j < 101){
            if (j % 2 == 0){
               temp += j ;
            }
            j++;
        }
        System.out.println(temp);

        int x = 0;
        while (x++ < 10){
            if (x % 2  != 0){
                continue;
                }
            System.out.println(x);
        }

        int y = 50;
        do{
            System.out.println(y);
            y++;
        } while (y <= 10);
    }
}
