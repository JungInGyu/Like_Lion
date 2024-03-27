package com.example.day01.day03;

import java.util.Scanner;

public class TestExam2 {
    public static void main(String[] args) {
        /*
     * 나이를 입력받아 20살 이상이면 “성인입니다.” 라고 출력하고 그렇지 않으면
     * “당신은 ○년 후에 성인이 됩니다.” 라는 메시지를 출력하는 프로그램을 작성하시오.
    입력예 : 18
    출력예 : 당신은 2년 후에 성인이 됩니다.
     */
        Scanner sc = new Scanner(System.in);
        System.out.println("나이를 입력해주세요");
        int age = sc.nextInt();
        if (age >= 20) {
            System.out.println("성인입니다.");
        } else {
            System.out.printf("당신은 %d년 후에 성인이 됩니다.", 20 - age);
        }

        	/*
     * 복싱체급은 몸무게가 50.80kg 이하를 "플라이급",
     * 61.23kg 이하 "라이트급", 72.57kg 이하 "미들급",
     * 88.45kg 이하 "크루저급", 그 이상을 "헤비급"이라고 하자.
     * 몸무게를 입력받아 체급을 출력하는 프로그램을 작성하시오.
    입력예 : 87.3
    출력예 : 크루저급
     */
        System.out.println("몸무게를 입력 해주세요.");
        double weight = sc.nextDouble();
        if (weight <= 50.8) {
            System.out.println("플라이급");
        } else if (weight > 50.8 && weight <= 72.57) {
            System.out.println("미들급");
        } else {
            System.out.println("헤비급");
        }

        	/*
     * 두 개의 실수를 입력받아 모두 4.0 이상이면 "A",
     * 모두 3.0 이상이면 "B", 아니면 "C" 라고 출력하는 프로그램을 작성하시오.
    입력예 : 4.3 3.5
    출력예 :B
    입력예 : 4.0 2.9
    출력예 :C
     */
        System.out.println("첫번째 실수를 입력해주세요.");
        double x = sc.nextDouble();
        System.out.println("두번째 실수를 입력해주세요.");
        double y = sc.nextDouble();
        if (x >= 4.0 && y >= 4.0) {
            System.out.println("A");
        }
    }
}
