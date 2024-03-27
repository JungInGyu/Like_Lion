//package com.example.day01.day04;
//
//public class ArrayExampleTest {
//    public static void main(String[] args) {
////        문제 1: 기본형 배열 선언문과 슬리퍼
////        int유형의 배열 numbers을 선언하고, 크기가 10인 배열로 띄우세요.
////        배열의 모든 요소를 0부터 9까지의 숫자로 호출하는 코드를 작성하세요
//        int[] numbers = new int[10];
//        for (int i = 0; i < numbers.length; i++){
//            numbers[i] = i;
//            System.out.println(numbers[i]);
//        }
//
////        문제 2: 배열의 값 출력
////        double유형의 배열이 doubles다음과 같이 열려 있습니다.
////        double[] doubles = {1.0, 2.5, 3.7, 4.4};
////        배열의 모든 요소를 출력하는 코드를 루프를 사용하여 작성하세요.
//
//        double[] doubles = {1.0, 2.5, 3.7, 4.4};
//        for (double i : doubles){
//            System.out.println(i);
//        }
////        문제 3: 배열의 길이에 따라
////        String유형의 배열이 words다음과 같이 열려 있습니다.
////        String[] words = {"Hello", "World", "Java", "Programming"};
////        배열 words의 길이를 출력하는 코드를 작성하세요.
//
//        String[] words = {"Hello", "World", "Java", "Programming"};
//        System.out.println(words.length);
//
////        문제 4: for-each 문을 사용하여 배열 요소 출력
////        int유형의 배열이 numbers다음과 같이 열려 있습니다.
////        int[] numbers = {5, 10, 15, 20, 25};
////        for-each 문을 사용하여 배열 numbers의 모든 요소를 출력하는 코드를 작성하세요.
//        int[] numbers2 = {5, 10, 15, 20, 25};
//
//        for (int i : numbers2){
//            System.out.println(i);
//        }
//
////        문제 5: 이차원 배열의 선언, PDF 및 출력
////        int유형의 이차원 배열을 matrix선언하고, 다음과 같은 모양으로 띄우세요.
////        1 2 3
////        4 5 6
////        7 8 9
////        matrix루프를 사용하여 코드를 작성하기 위한 이차원 배열 의 모든 요소를 작성하세요. 출력하는 것이 좋을 것 같아요.
//        int[][] matrix = new int[3][3];
//        int num = 1;
//        for (int i = 0; i < matrix.length; i++){
//            for (int j = 0; j < matrix.length; j++){
//                matrix[i][j] += num;
//                System.out.print(matrix[i][j] + "\t");
//                num += 1;
//            }
//            System.out.println();
//        }
//
////        문제 1: 배열 역순 출력
////        int유형의 배열을 어떻게 numbers구성했을 때, 배열의 요소를 역순으로 출력하여 코드를 작성하세요.
////        int[] numbers = {3, 6, 9, 12, 15};
//
//        int[] numbers3 = {3, 6, 9, 12, 15};
//        for (int i=4; i >= 0; i--){
//            System.out.println(numbers3[i]);
//        }
//
////        제 2: 최대값과 최소값 찾기
////        double유형의 배열 doubles에서 최대값과 최소값을 얻어 출력하는 코드를 작성하세요.
////        double[] doubles = {1.5, 3.7, 2.4, 9.8, 7.6, 3.4};
//
//
//        double[] doubles2 = {1.5, 3.7, 2.4, 9.8, 7.6, 3.4};
//        double min = doubles2[0];
//        double max = doubles2[0];
//
//        for (double numb : doubles2){
//            if (numb > max ){
//                max = numb;
//            }
//            if (numb < min){
//                min = numb;
//            }
//        }
//        System.out.println("최소값 : " + min + "\n최대값 : " + max);
//
////        문제 3: 배열의 숫자와 평균
////        int유형의 배열 scores에 모든 숫자가 있고 평균을 사용하는 코드를 작성하세요. 평균은 소수점 두자리까지 출력하세요.
////        int[] scores = {70, 85, 90, 45, 100};
//
//        int[] scores = {70, 85, 90, 45, 100};
//        double average =0.0;
//        for (int avg : scores){
//            average += avg;
//        }
//        average = average / scores.length;
//        System.out.printf("점수 평균은 : %.2f\n",average);
//
////        문제 4: 배열 요소의 이동
////        String유형의 배열이 words있을 때, 모든 요소를 한 칸씩 두고 오른쪽으로 이동하여 작성하세요. 마지막 요소는 배열의 첫 번째 요소로 이동해야 합니다.
////        String[] words = {"Java", "Python", "C", "JavaScript"};
////        예시:{"JavaScript", "Java", "Python", "C"}
//        String[] words2 = {"Java", "Python", "C", "JavaScript"};
//        String[] words3 = java.util.Arrays.copyOfRange(words2,0,words2.length);
//        int num0 = 1;
//        for (String i : words3){
//            if (num0 == words2.length){
//                num0 = 0;
//            }
//            words2[num0] = i;
//            num0 +=1;
//        }
//        System.out.printf("{\"%s\", \"%s\", \"%s\", \"%s\"}",words2[0],words2[1],words2[2],words2[3]);
//
//
//        //    문제 5: 두 배열의 합집합
//    //    int유형의 두 배열 array1과 array2가 어떻게 되었는지, 두 배열의 합집합을 구하여 새 배열에 저장하고, 결과 배열을 출력하는 코드를 작성하세요. 합집합 배열에는 유독한 요소가 없어야 합니다.
//
//        int[] array1 = {1, 3, 5, 7, 9};
//        int[] array2 = {0, 2, 4, 6, 8, 10, 3, 5};
////        int[] result_array = java.util.Arrays.copyOfRange(array2,0,array2.length);
//        int[] result_array = {};
//
//        int number2 = 0;
//        for (int i : array2){
//            result_array = numbers2;
//            for (int j : array1){
//                    for (int x =0; i < result_array.length; i++){
//
//                    }
//                }
//
//                result_array[number2] =
//            }
//
//            number2++;
//        }
//    }
//}
