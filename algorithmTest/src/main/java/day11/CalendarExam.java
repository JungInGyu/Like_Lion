package day11;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarExam {

    public static void printCalendar(int year, int month){
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month-1);
        calendar.set(Calendar.DATE,1);

        //마지막날
        int lastOfDate = calendar.getActualMaximum(Calendar.DATE);
        //해당월의 첫 요일
        int week = calendar.get(Calendar.DAY_OF_WEEK);
        System.out.println("\t\t "+calendar.get(Calendar.YEAR) + "년" + (calendar.get(Calendar.MONTH)+1) + "월");

        System.out.println("일\t월\t화\t수\t목\t금\t토");
        //첫날 출력 전까지 공백 출력
        for (int i = 1; i < week; i++){
            System.out.print("\t");
        }

        for (int i=1; i < lastOfDate; i++){
            System.out.print(i+"\t");
            if (week %7 ==0){
                System.out.println();
            }
            week++;
        }

    }



    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);


        System.out.println(calendar.get(Calendar.MONTH));
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.DATE));


        Scanner sc = new Scanner(System.in);
        System.out.println("년도를 입력하세요.");
        int year = sc.nextInt();
        System.out.print("월 입력: ");
        int month = sc.nextInt();

        CalendarExam exam = new CalendarExam();
        exam.printCalendar(year,month);

    }
}
