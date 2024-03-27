package ch02;

import java.util.Arrays;
import java.util.Scanner;

class ScoreArrayMax {
    static int max(int[] scores){
        Arrays.sort(scores);
        int a = scores[0];
        for (int score : scores){
            if (a < score) {
                a = score;
            }
        }
        return a;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("학생 수를 입력해주세요 : ");
        int std = sc.nextInt();
        int[] std_score = new int[std];
        for (int i = 0; i < std; i++){
            System.out.println("점수를 입력해 주세요 : ");
            int score = sc.nextInt();
            std_score[i] = score;
        }
        System.out.println("최대값은 "+max(std_score));
    }
}
