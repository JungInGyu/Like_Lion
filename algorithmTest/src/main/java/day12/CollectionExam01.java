package day12;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class CollectionExam01 {

    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<>();
        System.out.println(strList.size());
        strList.add("a");
        strList.add("b");
        strList.add("c");

        System.out.println(strList.size());

        strList.add("a");
        strList.add("b");
        strList.add("c");
        strList.add("a");
        strList.add("b");
        strList.add("c");
        strList.add("a");
        strList.add("b");
        strList.add("c");
        strList.add("a");
        strList.add("b");
        strList.add("c");
        strList.add("a");
        strList.add("b");
        strList.add("c");

        System.out.println(strList.size());

        for (String str : strList){
            System.out.println(str);
        }

        System.out.println("====================");
        System.out.println(strList.get(0));
        System.out.println("====================");

//        Vector<String> vector = new Vector<>();
//        vector.addElement("a");
//        vector.addElement("b");

        List<String> list = new ArrayList<>();
        list.add("abc");
        list.add("def");
        list.add("hahaha");

        for (String str : list){
            System.out.println(str);
        }

    }
}
