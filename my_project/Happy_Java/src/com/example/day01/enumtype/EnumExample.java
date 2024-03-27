package com.example.day01.enumtype;

public class EnumExample {
    // 요일을 나타내는 Enum 정의
    enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    // 주어진 요일에 따라 다른 작업을 수행하는 메서드
    public static void doTask(Day day) {
        switch (day) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("평일입니다. 열심히 일해야 합니다!");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("주말입니다. 쉬세요!");
                break;
            default:
                System.out.println("유효하지 않은 요일입니다.");
                break;
        }
    }

    public static void main(String[] args) {
        // doTask 메서드를 호출하여 요일에 따른 작업 수행
        doTask(Day.MONDAY);
        doTask(Day.SATURDAY);
        doTask(Day.valueOf("WEDNESDAY")); // Enum 상수의 문자열로부터 Enum 객체 생성 예시
        doTask(Day.valueOf("SATURDAY"));
    }
}