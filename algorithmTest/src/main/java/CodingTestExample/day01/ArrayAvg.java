package CodingTestExample.day01;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

class ArrayAvg {
     public double soluction(int[] numbers) {
         double answer = 0;
         for (int i =0; i< numbers.length; i++){
             answer += numbers[i];
         }
         answer = answer / numbers.length;
         return answer;
     }

     public static void main(String[] args) {
         ArrayAvg avg = new ArrayAvg();
         avg.soluction(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});



         int a = 1234;
         String as = Integer.toString(a);
         System.out.println(as.length());

         String f = "ss";
         String s = "ss";

     }

}
