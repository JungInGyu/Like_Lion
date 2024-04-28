package day18;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LamdaExam1 {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("Apple","Banana","Cherry");

        Consumer<String> ramdaTest = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        items.forEach(ramdaTest);

        items.forEach(item -> System.out.println(item));



        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread Start!!");
            }
        }).start();

        new Thread(() -> System.out.println("Thread Start!!")).start();
    }
}
