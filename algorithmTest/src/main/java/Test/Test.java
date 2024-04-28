package Test;

import ch07.ClassA;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Test extends ClassA{

    public int getNumber() {
        return number;
    }

    public void print(ClassA a){
        System.out.println(a.name);

    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        String str = new String(Arrays.toString(arr));

        HashMap<Integer, Integer> map = new HashMap<>();
        long[] abc = new long[3];
        ClassA a = new ClassA();
//        System.out.println(a.address);  //private
//        System.out.println(a.count);    //package
//        System.out.println(a.number);   //protected
        System.out.println(a.name);     //public
    }
}