package com.example.day01.day03;

public class SwitchExam1 {
    public static void main(String[] args){
        int num = 1;
        switch (num){
            case 1 :
                System.out.println("num의 값은 "+num+"입니다.");
                break;
            case 2 :
                System.out.println("num의 값은 "+num+"입니다.");
                break;
            case 3 :
                System.out.println("num의 값은 "+num+"입니다.");
                break;
            case 4 :
                System.out.println("num의 값은 "+num+"입니다.");
                break;
            default:
                System.out.println("올바른 숫자가 아닙니다.");
        }
        char ch = 'a';
        if (ch == 'a' || ch == 'A'){
            System.out.println("A입니다.");
        } else if (ch == 'b' || ch == 'B') {
            System.out.println("B입니다.");
        }
        else if (ch == 'c' || ch == 'C') {
            System.out.println("B입니다.");
        } else {
            System.out.println("A , B , C 가 아닙니다.");
        }

    }
}
