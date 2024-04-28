package Test;

import java.util.*;
class Solution {
    public static void main(String[] args) {
        //먼저 공백 기준으로 리스트에 데이터 추가
        //리스트를 순회하며 x만 존재한다면 지우고 count ++

        String polynomial = "3x + 7 + x";
        String answer = "";

        List<String> str = new ArrayList<>();
        str = Arrays.asList(polynomial.split(" "));
        System.out.print(str);
        int count =0;


        for (String s : str){
            if(s.matches("x")){
                str.remove(count);
            }
            count++;
        }
        System.out.println(str);
    }
}