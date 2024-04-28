package day18;

import java.util.Arrays;
import java.util.List;

public class LamdaExam3 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice","Jung","Charlie","Bob");

//        names.sort(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.compareTo(o2);
//            }
//        });
//
//        System.out.println(names);

        System.out.println(names);

        names.sort((String s1, String s2) -> s1.compareTo(s2));

        System.out.println(names);
    }
}
