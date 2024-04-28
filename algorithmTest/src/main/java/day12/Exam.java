package day12;



import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

public class Exam {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("test");
        list.add(10);
        list.add(new Book());

        System.out.println(list);

        Integer i =(Integer) list.get(1);
        System.out.println(i);
        int value = (Integer) list.get(1);


        List<String> strList = new ArrayList<>(); //제네릭!!
        strList.add("abc");
//        strList.add(10);
    }
}
