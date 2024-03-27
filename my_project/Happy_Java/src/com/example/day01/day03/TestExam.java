package com.example.day01.day03;

import java.util.Random;
import java.util.Scanner;

public class TestExam {
    public static void main(String[] args) {
//        실습 문제 1: 온도 변환기
//        사용자로부터 섭씨 온도를 입력받아 화씨 온도로 변환하는 프로그램을 작성하세요. 변환 공식은 F = C * 9/5 + 32 입니다. 변환된 화씨 온도를 출력하세요.
        Scanner sc = new Scanner(System.in);
        System.out.print("섭씨 온도를 입력해주세요. : ");
        double temp = sc.nextDouble();
        double f_temp =  temp * 9/5 + 32;
        System.out.printf("화씨 온도는 : %f",f_temp);
////        실습 문제 2: 짝수와 홀수 판별기
////        사용자로부터 정수 하나를 입력받아, 그 수가 짝수인지 홀수인지 판별하는 프로그램을 작성하세요. if-else 문을 사용하여 구현하세요.
        System.out.println("숫자를 입력해 주세요 : ");
        int num = sc.nextInt();
        if (num %2 == 0){
            System.out.println("짝수입니다.");
        } else {
            System.out.println("홀수입니다.");
        }
////
////                실습 문제 3: 구구단 출력기
////        while 루프를 사용하여 2단부터 9단까지의 구구단을 출력하는 프로그램을 작성하세요. 각 단은 한 줄에 하나씩 출력되어야 합니다.
        for (int i = 2; i < 10; i++){
            for (int j = 1; j<10; j++){
                System.out.printf("%d * %d = %d\t",i,j,i*j);
            }
            System.out.println("");
        }
//
//                실습 문제 4: 팩토리얼 계산기
//        사용자로부터 정수 n을 입력받아, 1부터 n까지의 곱(팩토리얼)을 계산하는 프로그램을 작성하세요. 예를 들어, 사용자가 5를 입력하면, 5! = 120을 출력하세요. for 또는 while 루프를 사용하여 구현하세요.
        System.out.println("정수를 입력해주세요.");
        int n = sc.nextInt();
        int result =n;
        for (int x = 1; x < n; x++){
            result *= x ;
        }
        System.out.println(n + "! = " + result);


//                실습 문제 5: 숫자 맞추기 게임
//        프로그램이 1부터 100 사이의 임의의 숫자를 선택하고, 사용자가 그 숫자를 맞추도록 하는 게임을 만드세요. 사용자가 숫자를 입력할 때마다,
//        프로그램은 사용자의 입력이 정답보다 큰지, 작은지, 또는 정답인지를 알려주어야 합니다. 사용자가 정답을 맞출 때까지 이 과정을 반복하세요.
//        while 루프와 if-else 문을 사용하여 구현하세요.

        Random random = new Random();
        int random_int = random.nextInt(100)+1;
        boolean flag = true;
        while (flag){
            System.out.println("숫자를 입력해주세요 : ");
            int numb = sc.nextInt();
            if (numb < random_int){
                System.out.println("정답보다 작습니다.");
            } else if (numb > random_int) {
                System.out.println("정답보다 큽니다.");
            } else {
                System.out.println("정답입니다.");
                break;
            }
        }
//                실습 문제 6: 양의 정수의 합 구하기
//        사용자로부터 양의 정수들을 계속 입력받되, 사용자가 0을 입력하면 입력을 중단하고 그때까지 입력받은 양의 정수들의 총합을 출력하는 프로그램을 작성하세요.
//        do-while 루프를 사용하여 구현하세요.
        int num_z;
        int sum2 = 0;
        do {
            System.out.println("양수를 입력하세요:");
            num_z = sc.nextInt();
            if (num_z <= 0) {
                System.out.println("잘못된 입력입니다. 양수를 입력하세요.");
            } else {
                sum2 += num_z;
            }

        }while (num_z != 0);
        System.out.println("양의 정수들의 총합은 : " + sum2);

    }
}
