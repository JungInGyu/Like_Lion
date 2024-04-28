package day13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test implements Comparable <Test>{
    private int b;

    public Test(int b) {
        this.b = b;
    }

    @Override
    public int compareTo(Test o) {
        if(o.b == 1){
            return o.b - this.b;
        }
        return this.b-o.b;
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(20);
        arr.add(1000);
        arr.add(100);

        System.out.println(arr);
        Collections.sort(arr);
        System.out.println(arr);
    }
}
