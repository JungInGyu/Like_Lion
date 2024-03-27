package com.example.day01.day04;

public class ItemForArray {
    private int price; // 속성, 필드
    private String name;
    // 클래스의 생성자
    public ItemForArray(int price, String name){
        this.price = price;
        this.name = name;

    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
