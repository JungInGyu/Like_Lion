package day18;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

public class LamdaExam4 {
    public static void main(String[] args) {
        //Predicate
        //조건을 테스트하는데 사용. bollean값 반환
        Predicate<Integer> isPositive = x -> x > 0;

        System.out.println(isPositive.test(10));
        System.out.println(isPositive.test(-10));

        //Counsumer
        //입력을 받고 반환값이 없는 연산을 수행
        Consumer<String> printer = s -> System.out.println(s);
        printer.accept("hello Ingyu!!");

        //Function
        //입력을 받아서 출력을 반환하는..
        Function<String, Integer> lengthFunc = str -> str.length();
        System.out.println(lengthFunc.apply("123456789"));

        //Supplier
        //입력 없이 값을 반환
        Supplier<Double> randomSupplier = () -> Math.random() * 100 + 1;
        System.out.println(randomSupplier.get());

        IntSupplier intSupplier = () -> (int) (Math.random() * 6) + 1;
        System.out.println(intSupplier.getAsInt());

        //UnaryOperation
        //입력과 출력이 같은 타입의 값일 때 사용.
        UnaryOperator<Integer> sqrt = x -> x * x;
        System.out.println(sqrt.apply(5));

        //BiFunction
        //두 개의 입력을 받고 하나의 결과를 반환
        BiFunction<Integer, Integer, Integer> add = (a,b) -> a+b;
        System.out.println(add.apply(10,20));

        //Consumer 의 andThen 메서드 활용

        Consumer<String> conA = s -> System.out.println(s+"aaaa");
        Consumer<String> conB = s -> System.out.println(s+"bbbb");

        conA.accept("Ingyu");
        conB.accept("Ingyu");

        Consumer<String> conAB = conA.andThen(conB);
        conAB.accept("Hello");

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        Consumer<String> printConsumer = name -> System.out.println(name);
        names.forEach(printConsumer);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Predicate<Integer> isEven = number -> number % 2 == 0;
        List<Integer> evenNumbers = numbers.stream().filter(isEven).collect(Collectors.toList());
        System.out.println(evenNumbers);


    }
}
