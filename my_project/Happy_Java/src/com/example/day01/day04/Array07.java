package com.example.day01.day04;

public class Array07 {
    public static void main(String[] args) {
//        타입[][] 변수명 = new 타입[행의수][열의수];
//        변수명[행인덱스][열인덱스] = 값;
        int[][] iarr = new int[3][2];
        iarr[0][1] = 10;

        int[][] iarr2 = new int[3][];
        iarr2[0] = new int[3];
        iarr2[1] = new int[2];
        iarr2[2] = new int[10];

        iarr2[0][0] = 10;

        int[][][] iarr3 = new int[3][][];

        int[][] array = new int[2][3];
        for (int i =0; i < array.length; i++){
            for (int j=0; j < array[i].length; j++){
                array[i][j] = ( 1+ i)*j;
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
