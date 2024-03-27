package com.example.day01.day03;

public class Gugudan2 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++){
            for (int j = 1; j<10; j++){
                System.out.print(j + " * " + i + " = " + j*i + "\t");
            }
            if (i == 5)
                break;
            System.out.println("");
        }

        // for each문
//        for (String i : args){
//
//        }

    }
}
