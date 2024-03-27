package com.example.util;

import java.util.Random;

public class Dice {

    int face =6;
    int eye;

    public void dice(){
        eye = new Random().nextInt(face)+1;
    }

    public int eye(){
        return eye;
    }

}
