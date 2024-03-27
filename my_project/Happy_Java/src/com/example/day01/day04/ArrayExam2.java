package com.example.day01.day04;

public class ArrayExam2 {
    public static void main(String[] args) {
        int[] arr1 = new int[5];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        arr1[3] = 4;
        arr1[4] = 5;
        int[] arr2 = new int[]{1,2,3,4,5};
        int[] arr3 = {1,2,3,4,5};

        System.out.println("arr1 의 값 출력");
        for(int i = 0; i < 5; i++){
            System.out.println(arr1[i]);
        }
        System.out.println("arr2 의 값 출력");
        for(int i = 0; i < 5; i++){
            System.out.println(arr2[i]);
        }
        System.out.println("arr3 의 값 출력");
        for(int i = 0; i < 5; i++){
            System.out.println(arr3[i]);
        }

    }
}
