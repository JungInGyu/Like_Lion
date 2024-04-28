package day19;

import java.util.Arrays;
import java.util.List;

public class ReduceTest {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        int sum = numbers.stream().reduce(0, (a, b) -> a + b); //reduce는 앞에서 계산한 값을 가지고 계산함. i = i + b와 같은개념

        System.out.println(sum);

        List<Member> memberList = Arrays.asList(
                new Member("jung", 100),
                new Member("kang", 90),
                new Member("hong", 80),
                new Member("lee", 98)
        );

        int memberScoreSum = memberList.stream().mapToInt(Member::getScore).sum();

        System.out.println(memberScoreSum);

        int memberScoreSum2 = memberList.stream().mapToInt(Member::getScore).reduce(0, (a, b) -> a + b);
        System.out.println(memberScoreSum2);

        int memberScoreSum3 = memberList.stream().mapToInt(Member::getScore)
                .reduce((a, b) -> a + b).getAsInt();
        System.out.println(memberScoreSum3);
    }
}
