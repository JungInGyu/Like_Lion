package com.example.day01.day04;

public class CalTest {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        int resultValue = cal.plus(1,2,3,4,5,6,7,8);

        int result = cal.minus(1,2,3,4,5,6);
        System.out.println(resultValue);
        System.out.println(result);
    }
}
