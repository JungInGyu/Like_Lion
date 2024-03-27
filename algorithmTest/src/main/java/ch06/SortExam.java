package ch06;

import java.util.Arrays;

public class SortExam {
    public static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length - i - 1; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            System.out.println(i+1+"번째 :: "+Arrays.toString(arr));
        }
    }

    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void selectionSort(int[] arr){

        for (int i =0; i < arr.length -1 ; i++){
            int minindex = i;
            for (int j= i+1; j < arr.length; j++){
                if (arr[j] < arr[minindex]){
                    minindex = j;
                }
                swap(arr, i,minindex);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr ={64,33,67,22,6,88,5};
        System.out.println("원래배열 : "+ Arrays.toString(arr));

//        bubbleSort(arr);
//
//        System.out.println("정렬 후 배열 : " + Arrays.toString(arr));

        selectionSort(arr);

        System.out.println("정렬 후 배열 : " + Arrays.toString(arr) );
    }
}
