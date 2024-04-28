package day18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class LamdaExam5 {
    public static void main(String[] args) {
        //메소드참조 ::
        //1. 정적 메서드 참조
        BiFunction<Integer, Integer, Integer> maxFunc = Math::max;
        BiFunction<Integer, Integer, Integer> maxFunc2 = (a,b) -> Math.max(a,b);
        System.out.println(maxFunc.apply(5,10));

        //2. 인스턴스 메서드 참조
        String str = "Hello World";
        Supplier<Integer> lengthfunc = str::length;
        System.out.println(lengthfunc.get());

        //3. 임의 객체의 인스턴스 메서드 참조
        List<String> words = Arrays.asList("Hello","world","java","Ingyu");
        List<Integer> lengths = new ArrayList<>();

        Function<String,Integer> lengthFunc2 = String::length;

        for (String word : words){
            lengths.add(lengthFunc2.apply(word));
        }

        //4. 생성자 참조
        Supplier<List<String>> listSupplier = ArrayList::new;

        List<String> list = listSupplier.get();
        list.add("hello");
        list.add("world");
        list.add("hahaha");

        System.out.println(list);
    }
}
