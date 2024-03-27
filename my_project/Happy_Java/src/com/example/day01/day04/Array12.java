package com.example.day01.day04;

public class Array12 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40};

        //for each 문

        for (int i : arr){
            System.out.println(i);
        }

        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

        ItemForArray[] items = new ItemForArray[4];
        items[0] = new ItemForArray(3000, "cup");
        items[1] = new ItemForArray(4000, "cup1");
        items[2] = new ItemForArray(5000, "cup2");
        items[3] = new ItemForArray(6000, "cup3");
        for (ItemForArray item : items){
            System.out.println(item.getName());
            System.out.println(item.getPrice());
        }
    }
}
