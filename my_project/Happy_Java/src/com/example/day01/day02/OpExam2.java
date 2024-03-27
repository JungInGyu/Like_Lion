package com.example.day01.day02;

public class OpExam2 {
    public static void main(String[] args){
        Book book = new Book();
        System.out.println(book instanceof Object);
        if (book instanceof Object){
            System.out.println("com.example.day01.day02.Book 은 객체 입니다.");
        }
    }
}
