package com.example.day01.day04;

public class ArrayExam1 {
    public static void main(String args[]) {
        // 배열 선언
        int[] iarr;

        int iarr2[];

        // 배열 생성
        iarr = new int[3];
        iarr2 = new int[5];

        // 배열 사용법
        iarr[0] = 10;
        iarr[1] = 20;
        iarr[2] = 30;

        int j = iarr[0];

        System.out.println(j);
        System.out.println(iarr[0]);

        for (int i=0; i < 5; i++){
            iarr2[i] = iarr[2] * i;
            System.out.println(iarr2[i]);
        }

        int[] arr2 = new int[]{10,20,30};
        int[] arr3 = {10,20,30,40};

        System.out.println(arr2[2]);
        System.out.println(arr3[3]);
    }
}
