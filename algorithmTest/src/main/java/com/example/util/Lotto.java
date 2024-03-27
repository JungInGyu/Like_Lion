package com.example.util;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lotto {

    int[] lotto_num;

    int[] pick_num;

    int number;

    public void lotto_ball(){
        lotto_num = new int[6];
        number = new Random().nextInt(45)+1;

        for (int i = 0; i < lotto_num.length; i++){
            number = new Random().nextInt(45)+1;
            boolean flag = false;
            for (int j = 0; j < i; j++){
                if (lotto_num[j] == number){
                    flag = true;
                    break;
                }
            }

            if (flag){
                i--;
            } else{
                lotto_num[i] = number;
            }
        }
        Arrays.sort(lotto_num);
    }

    public void lotto_print(){
        for (int i =0; i < lotto_num.length; i++){
            int num = i +1;
            System.out.println(num + "번째 숫자 : " + lotto_num[i]);
        }
    }

    public void  pick_num(){
        Scanner sc = new Scanner(System.in);
        pick_num = new int[6];
        System.out.println("0부터 45까지의 중복되지 않는 숫자 6개의 숫자를 정해주세요.");
        for (int i = 0; i < 6; i++){
            pick_num[i] = sc.nextInt();
        }
        Arrays.sort(pick_num);
    }

    public String lotto_result(){
        String result = "";
        int count = 0;
        for (int i = 0; i < 6; i++){
            for (int j = 0; j < i; j++){
                if (lotto_num[i] == pick_num[j]){
                    count++;
                }
            }
        }
        switch (count){
            case 6 :
                result = "축하합니다 1등입니다.";
                break;

            case 5 :
                result = "축하합니다 2등입니다.";
                break;

            case 4 :
                result = "축하합니다 3등입니다.";
                break;

            case 3 :
                result = "축하합니다 4등입니다.";
                break;

            default:
                result = "아쉽지만 꽝입니다.";


        }
        return result;
    }
}
