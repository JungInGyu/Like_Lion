package day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> scores = new ArrayList<>();

        // 점수 입력 받기
        readScores(input, scores);

        // 0점 제거
        removeZero(scores);

        // 결과 출력
        printScores(scores);

        // 리소스 정리
        input.close();
    }

    private static void printScores(List<Integer> scores) {
        int sum = 0;
        for (int score : scores){
            sum+=score;
            System.out.println("입력된 점수는: "+score);
        }
        System.out.println("입력된 모든 점수의 합은: "+ sum + "\n평균 점수는: "+sum/scores.size());
    }

    private static void removeZero(List<Integer> scores) {
        scores.remove(scores.indexOf(0));
    }

    private static void readScores(Scanner input, List<Integer> scores) throws IllegalArgumentException{
        while (true){
            try {
                System.out.println("0-100사이의 숫자를 입력해주세요.");
                int score = input.nextInt();
                if(score < 0 || score > 100){
                    throw new IllegalArgumentException("0-100 사이의 숫자만 입력 가능합니다.");
                } else {
                    scores.add(score);
                }
                if (score == 0){
                    System.out.println("입력을 종료합니다.");
                    break;
                }
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException(Arrays.toString(e.getStackTrace()));
            }
        }
    }
}

