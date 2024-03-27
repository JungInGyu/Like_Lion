package com.example.day01.day02;

public class Rectangle{
    int j; // (전역변수) (필드) 필드는 초기화 하지 않아도됨

    public static void main(String[] args){
        //while(조건) { 문장 }

        int i = 1; // (지역변수) 꼭 초기화 해주어야함.

        while (i <= 10){
            System.out.println("****************");
            i++;
        }
        int num = 1;
        while (num <= 10){
            int temp = 1;
            while (temp <= num){
                System.out.print("*");
                temp++;
            }
            System.out.print("\n");
            num++;
        }
        int num2 = 1;
        while (num2 <= 100){
            System.out.println(num2);
            num2++;
        }

        //1. 변수 선언과 초기화 연습
        int a=10,b=20,c=30;
        System.out.println(a+b+c);
        //2. 변수명 규칙 이해
        // 다음중 올바른 변수명을 모두 고르시오 'number1','_number','3rdNumber','$value','final'
        //1,2,3,4
        //3. 리터럴 활용 연습
        //문자 리터럴, 정수 리터럴, 부동 소수점 리터럴, 논리 리터럴을 각각 하나씩 사용하여 변수를 선언하고 초기화 하는 예제 코드를 작성하시오.
        String str;
        str = "";
        int num_leta;
        num_leta =0;
        float flo;
        flo = 0.0F;
        boolean yn;
        yn = true;
        //4. 출력문 연습
        int x;
        x=2;
        System.out.println(x);
        System.out.println(x*2);
    }
}
