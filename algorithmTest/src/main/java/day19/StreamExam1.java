package day19;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class StreamExam1 {
    public static void main(String[] args) {
        List<String> myList = Arrays.asList("asef", "bee", "acwwq", "asdd", "ewweqqa");

        List<String> filterdList = myList.stream() // 스트림 생성
                .filter(s -> s.startsWith("a")) // 중간연산
                .collect(Collectors.toList()); //최종연산
        System.out.println(filterdList);

        for (String str : myList) {
            char ch = str.charAt(0);
            if (ch == 'a') {
                filterdList.add(str);
            }
        }
        System.out.println(filterdList);

        String[] names = {"kang", "kim", "hong", "lee", "son"};
        for (String str : names) {
            System.out.println(str);
        }
        System.out.println("====================");
        Arrays.stream(names).forEach(System.out::println);
//        Arrays.stream(names).forEach(name -> System.out.println(name));
//        Arrays.stream(names).forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });

        int[] iarr = {1, 2, 3, 4, 5, 6, 7, 8};

        Arrays.stream(iarr).filter(num -> num % 2 == 0).forEach(System.out::println);

        //스트림 사용
        List<String> words = Arrays.asList("Apple", "Banana", "Cherry", "Apple", "Cherry", "Date");
        List<String> words2 = words.stream().filter(s -> s.length() >= 5).distinct().collect(Collectors.toList());
        System.out.println(words2);

        // 스트림 사용x
//        List<String> words2 = new ArrayList<>();
//        for (String str : words) {
//            if (str.length() >= 5 && !words2.contains(str)) {
//                words2.add(str);
//            }
//        }
//        System.out.println(words2);
        System.out.println("================");
        words.stream().map(word -> word.toUpperCase()).forEach(System.out::println);

        int[] intArr = {3, 6, 3, 76, 231, 2};

        //각 요소에 3을 곱해서 출력해주세요.

        Arrays.stream(intArr).map(num -> num * 3).forEach(System.out::println);


        List<List<String>> nestedList = Arrays.asList(Arrays.asList("Apple", "Banana"), Arrays.asList("Cherry", "Date"));
        System.out.println(nestedList);
        List<String> flattenedList = nestedList.stream().flatMap(Collection::stream).collect(Collectors.toList());
        System.out.println(flattenedList);

        List<String> list = Arrays.asList("hello java!!", "hi carami", "lambda stream");
        list.stream().flatMap(s -> Arrays.stream(s.split(" "))).forEach(System.out::println);

        List<String> list2 = Arrays.asList("1,3,4,6,7,8,9");
        list2.stream().flatMapToInt(data -> {
            String[] strArr = data.split(",");
            int[] intArr2 = new int[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                intArr2[i] = Integer.parseInt(strArr[i].trim());
            }
            return Arrays.stream(intArr2);
        }).forEach(System.out::println);


        list2.stream().flatMapToInt(data -> Arrays.stream(data.split(","))
                        .mapToInt(str -> Integer.parseInt(str.trim())))
                .forEach(System.out::print);

    }
}
