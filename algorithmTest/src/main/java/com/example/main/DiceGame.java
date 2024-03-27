package com.example.main;

import com.example.util.Dice;

public class DiceGame {
    public static void main(String[] args) {
        Dice dice = new Dice();
        dice.dice();
        System.out.println(dice.eye());


    }
}
