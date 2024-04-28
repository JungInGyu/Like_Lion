package day19;

import java.util.Arrays;

public class MatchTest {
    public static void main(String[] args) {
        int[] intArr = {2, 4, 6, 8};

        boolean result = false;
        result = Arrays.stream(intArr).allMatch(num -> num % 3 ==0 );
        System.out.println("모두 3의 배수 입니까??" + result);

        result = Arrays.stream(intArr).anyMatch(num -> num %3==0);
        System.out.println("하나라도 3의 배수 입니까??" + result);

        result = Arrays.stream(intArr).noneMatch(num -> num %3==0);
        System.out.println("모두 3의 배수가 아닙니까??" + result);

    }
}
