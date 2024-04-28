package day13;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExam {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("c");
        System.out.println(set);
        set.add("a");
        System.out.println(set);

        if (set.contains("h")){
            System.out.println(true);
        }



        Set<Pen> penSet = new HashSet<>();

        penSet.add(new Pen("red",500));
        penSet.add(new Pen("black",300));
        penSet.add(new Pen("blue",200));

        System.out.println(penSet);
        penSet.add(new Pen("red",400));
        System.out.println(penSet);
//        List<String> list = new ArrayList<>();
//        list.add("a");
//        list.add("b");
//        list.add("c");
//        list.add("a");
//        System.out.println(list);
    }
}
