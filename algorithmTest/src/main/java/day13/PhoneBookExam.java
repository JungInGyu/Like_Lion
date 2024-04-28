package day13;

import java.util.HashMap;
import java.util.Map;

public class PhoneBookExam {
    public static void main(String[] args) {
        Map<String, String> phoneBook = new HashMap<>();
        phoneBook.put("김철수", "010-1234-5678");
        phoneBook.put("박영희", "010-8765-4321");
        phoneBook.put("이민지", "010-5566-7788");

        // 특정 키를 이용해 전화번호 검색
        String minjiNumber = phoneBook.get("이민지");
        System.out.println("이민지의 전화번호"+minjiNumber);

        //전체 데이터 출력
        System.out.println("전체 전화번호 목록");
        for (Map.Entry<String, String> entry : phoneBook.entrySet()){
            System.out.println(entry.getKey() + ": "+entry.getValue());
        }

        if (phoneBook.containsKey("김철수")){
            System.out.println("존재해요.");
        }

        if (phoneBook.containsValue("010-8889-8888")){
            System.out.println("있어요");
        } else {
            System.out.println("없어요.");
        }

        if (!phoneBook.isEmpty()){
            System.out.println("데이터가 있습니다.");
        } else {
            System.out.println("데이터가 존재하지 않습니다.");
        }


        System.out.println(phoneBook.size());


    }


}
