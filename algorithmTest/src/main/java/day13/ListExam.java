package day13;

import java.util.*;

public class ListExam {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");

        String firstFruit = fruits.get(0);
        System.out.println(firstFruit);

        System.out.println(fruits);

        fruits.set(1,"blueberry");

        System.out.println(fruits);

        fruits.remove("cherry");
        System.out.println(fruits);

        fruits.remove(1);
        fruits.removeLast();
        System.out.println(fruits);

        Vector<String> vector = new Vector<>();
        vector.addElement("hi");
        vector.addElement("hi2");
        vector.addElement("hi3");
        vector.addElement("hi4");
        System.out.println(vector.size());
        for (String str : vector){
            System.out.println(str);
        }

        List<String> linkedList = new LinkedList<>();
        linkedList.add("a");
        linkedList.add("b");
        linkedList.remove("a");

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);

        System.out.println(integerList);
        Collections.shuffle(integerList);
        System.out.println(integerList);
        Collections.sort(integerList);
        System.out.println(integerList);
    }
}
