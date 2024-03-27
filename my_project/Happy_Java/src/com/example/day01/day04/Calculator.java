package com.example.day01.day04;

public class Calculator {
    //접근제한자 리턴타입 메소드명 (매개변수들..) {} <- 이게 메소드

    public int plus(int i, int j){
        return i+j;
    }

    public int plus(int i, int j, int x){
        return i+j+x;
    }

    public int plus(int... values){
        int sum = 0;
        for(int v : values){
            sum += v;
        }
        return sum;
    }

    public int minus(int... val){
        int sum = 0;
        for (int mi : val){
            sum -= mi;
        }
        return sum;
    }
}
