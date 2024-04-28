package day19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingTest {
    public static void main(String[] args) {
        List<Member> memberList = Arrays.asList(
                new Member("kang",20,Member.FEMALE),
                new Member("kim",23,Member.MALE),
                new Member("hong",22,Member.FEMALE),
                new Member("lee",32,Member.MALE)
                );

        Map<Integer, List<Member>>  mapbySex = memberList.stream()
                .collect(Collectors.groupingBy(Member::getSex));

        System.out.println("남자 ");
        mapbySex.get(Member.MALE).stream().forEach(member -> System.out.println(member.getName()));

        System.out.println("남자 ");
        mapbySex.get(Member.FEMALE).stream().forEach(member -> System.out.println(member.getName()));
    }
}
