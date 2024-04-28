package day19.Example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        // 1번 주어진 정수 배열에서 짝수만을 찾아 그 합을 구하시오.
        int[] numbers = {3, 10, 4, 17, 6};
        int result = Arrays.stream(numbers).filter(num -> num % 2 ==0).sum();
        System.out.println(result);

        // 2번 주어진 문자열 리스트에서 길이가 5 이상인 문자열만을 선택하여 대문자로 변환하고, 결과를 리스트로 반환하시오.
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date");
        List<String> words2 = words.stream().map(str -> str.toUpperCase()).filter(str -> str.length() >= 5).collect(Collectors.toList());
        System.out.println(words2);

        //3번 학생 객체의 리스트가 주어졌을 때, 성적(score)이 80점 이상인 학생들만을 선택하고, 이들의 이름을 알파벳 순으로 정렬하여 출력하시오.
        List<Student> students = Arrays.asList(
                new Student("Alice", 82),
                new Student("Bob", 90),
                new Student("Charlie", 72),
                new Student("David", 76)
        );
        List<Student> students2 = students.stream().filter(score -> score.getScore() >= 80).sorted(Comparator.comparing(Student::getName)).toList();
        students2.forEach(System.out::println);

        //4번 직원 객체의 리스트에서 각 부서(department)별로 평균 급여를 계산하시오.
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR", 3000),
                new Employee("Bob", "HR", 2000),
                new Employee("Charlie", "Engineering", 5000),
                new Employee("David", "Engineering", 4000)
        );

//        List<Employee> employees2 = employees.stream().map(Employee::getDepartment,Employee::getSalary)
    }
}
