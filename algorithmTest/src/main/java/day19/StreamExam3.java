package day19;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExam3 {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Banana", "Apple", "Cherry", "Date");

        List<String> sortedFruits = fruits.stream().sorted().collect(Collectors.toList());

        System.out.println(sortedFruits);

        List<String> reverseSortedFruits = sortedFruits.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        System.out.println(reverseSortedFruits);


        int[] iarr = {5, 3, 27, 9, 5, 9, 0, 4, 34};

        Arrays.stream(iarr).sorted().forEach(System.out::println);

        Arrays.stream(iarr)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

        int i =10;
        Integer ii = i; //오토 박싱

        int j = ii; // 오토 언박싱

    }
}
