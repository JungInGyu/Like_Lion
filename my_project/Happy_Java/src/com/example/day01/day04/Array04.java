package com.example.day01.day04;

public class Array04 {
    public static void main(String[] args) {
//        ItemForArray[] array1 = new ItemForArray[5];
//        ItemForArray array2[];
//        array2 = new ItemForArray[5];
//
//        array1[0] = new ItemForArray(1000,"pen");
//
//
//        ItemForArray[] array1 = new ItemForArray[3];
//        array1[0] = new ItemForArray(500, "사과");
//        array1[1] = new ItemForArray(300, "바나나");
//        array1[2] = new ItemForArray(900, "수박");
//        ItemForArray[] array2 = new ItemForArray[]{new ItemForArray(500, "사과"), new ItemForArray(300, "바나나"), new ItemForArray(900, "수박")};
//        ItemForArray[] array3 = {new ItemForArray(500, "사과"), new ItemForArray(300, "바나나"), new ItemForArray(900, "수박")};
//        System.out.println(array1[0].getName());
//        System.out.println(array1[0].getPrice());
//        System.out.println(array1[1].getName());
//        System.out.println(array1[1].getPrice());
//        System.out.println(array1[2].getName());
//        System.out.println(array1[2].getPrice());


        for (int i =0; i <5; i++){
            ItemForArray[] arr = new ItemForArray[5];
            arr[i] = new ItemForArray(i*200,"사과"+i);
            System.out.println(arr[i].getName());
            System.out.println(arr[i].getPrice());
        }
    }
}
