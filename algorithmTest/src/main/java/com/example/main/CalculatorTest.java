package com.example.main;

import com.example.util.Calculator;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println(cal.plus(3,5));
        System.out.println(cal.minus(6,2));
    }
}
