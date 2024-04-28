package day13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Person implements Comparable<Person>{
    private String naem;
    private int age;

    public Person() {
    }
    public Person(String naem, int age) {
        this.naem = naem;
        this.age = age;
    }

    @Override
    public String toString() {
        return naem + " : " + age;
    }

    @Override
    public int compareTo(Person o) {
        return this.age - o.age; //나이를 기준으로 오름차순 정렬.
    }

    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("kang",30));
        list.add(new Person("kim",20));
        list.add(new Person("jung",25));

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o2.age - o1.age;
            }
        });

        System.out.println(list);
    }
}




