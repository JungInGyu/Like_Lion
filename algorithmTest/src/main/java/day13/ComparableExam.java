package day13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExam {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("jung");
        list.add("in");
        list.add("gyu");
        list.add("kim");

        System.out.println(list);

        Collections.sort(list);

        System.out.println(list);
    }
}
