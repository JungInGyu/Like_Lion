package day12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordCollectionExam {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<String> str = new ArrayList<>();

        inputWord(sc,str);

        removeWord(str);

        printWord(str);


    }

    private static void printWord(List<String> str) {
        for (String word : str){
            System.out.println("입력된 단어는: "+word);
        }
        System.out.println("입력된 단어의개수는: "+str.size());
        int max = str.get(0).length();
        int index = 0;
        for (String word : str){
            if (word.length() > max){
                max = word.length();
                index = str.indexOf(word);
            }
        }
        System.out.println("입력된 단어 중에서 가장 긴 단어는: "+str.get(index) + "\n해당 단어의 길이: "+str.get(index).length());
    }

    private static void removeWord(List<String> str) {
        str.remove("quit");
    }

    private static void inputWord(Scanner sc, List<String> str) {
        while (true){
            System.out.println("단어를 입력해주세요: ");
            String word = sc.nextLine();
            if (!word.equals("quit")) {
                str.add(word);
            } else {
                break;
            }
        }
    }
}
