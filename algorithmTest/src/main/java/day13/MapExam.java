package day13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExam {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(111,"jung");
        map.put(222,"in");
        map.put(333,"gyu");

        System.out.println(map.get(111));

        System.out.println(map);

        Set<Integer> keyset = map.keySet();
        Iterator<Integer> keyIter = keyset.iterator();
        while (keyIter.hasNext()){
            Integer key = keyIter.next();
            System.out.print("key : "+key);
            System.out.println("\tvalue: "+map.get(key));
        }

        for (Integer key : keyset){
            System.out.print("key : "+key);
            System.out.println("\tvalue: "+map.get(key));
        }
    }
}
