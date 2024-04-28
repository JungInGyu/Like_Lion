package day18.Example;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaExam {
    public static void main(String[] args) {
        //    ### 문제 1: 문자열 리스트 정렬하기
        //**요구 사항**: 주어진 `List<String>`을 문자열 길이에 따라 정렬하되, 람다식을 사용하여 `Collections.sort()` 메서드를 활용하라.
        List<String> list = Arrays.asList("aaaaa", "cccc", "bbb", "dddddd");
        Collections.sort(list, (String s, String s2) -> s.length() - s2.length());
        System.out.println(list);
        //   ### 문제 2: 최대값 찾기
        //**요구 사항**: 주어진 정수 배열에서 최대값을 찾아 출력하라. 람다식을 사용하여 자바의 `Comparator` 인터페이스와 함께 `Arrays.sort()`를 활용하라.
        List<Integer> numList = Arrays.asList(1,10,2,19,5,47,2);
        Collections.sort(numList, (Integer x, Integer y) -> {
            return x.compareTo(y);
        });
        System.out.println(numList.getLast());
        //### 문제 3: 리스트의 각 요소에 연산 적용하기
        //**요구 사항**: 주어진 `List<Integer>`의 각 요소에 10을 더한 결과를 새 리스트에 저장하고 출력하라. 람다식을 사용하여 `List`의 `forEach()` 메서드를 활용하라.
        List<Integer> numli = Arrays.asList(1,4,5,9);
        List<Integer> result = new ArrayList<>();

        numli.forEach(num -> result.add(num+10));
        System.out.println(result);

        //            ### 문제 4: 조건에 맞는 요소 찾기
        //**요구 사항**: 주어진 `List<String>`에서 글자 수가 5 이상인 첫 번째 단어를 찾아 출력하라. `for` 루프와 람다식을 활용하여 조건에 맞는 요소를 찾아보세요.
        List<String> strli = Arrays.asList("a","ab","abcc","aawweee","aaaaaa");
        Predicate<String> aa = ss -> ss.length() >= 5;
        for (String ss : strli){
            if (aa.test(ss)){
                String answer = ss;
                System.out.println(answer);
                break;
            }
        }
        //            ### 문제 5: 요소 변환하기
        //**요구 사항**: 주어진 `List<Integer>`의 각 요소를 제곱한 결과를 새 리스트에 저장하고 출력하라. `for` 루프와 람다식을 활용하여 각 요소를 변환하라.
        List<Integer> numm = Arrays.asList(1,2,3,4,5);
//        Consumer<Integer> nums = n -> n * n;

        //            ### 문제 6: 모든 요소에 대해 조건 확인하기
        //**요구 사항**: 주어진 `List<Integer>`의 모든 요소가 짝수인지 확인하라. 람다식을 활용하여 조건 검사를 수행하고 결과를 출력하라.


    }




}
