package com.example.day01.day04;

public class Array13 {
    public static void main(String[] args) {
        ItemForArray[] item = new ItemForArray[3];
        item[0] = new ItemForArray(500,"사과");
        item[1] = new ItemForArray(300,"바나나");
        item[2] = new ItemForArray(900,"수박");

        for (ItemForArray i : item){
            System.out.println(i.getPrice());
            System.out.println(i.getName());
        }



    }
}
