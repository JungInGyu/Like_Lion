package ch03;

import java.util.Arrays;

public class SearchExam {
    static int sequentialSearch(int[] array, int key){
        for (int i=0; i < array.length; i++){
            if (array[i] == key){
                return i;
            }
        }
        return -1;
    }

    static int binarySearch(int[] array, int key){
        // low = 배열의 첫인덱스
        int low = 0;
        // high = 배열의 마지막 인덱스
        int high = array.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] == key)
                return mid; // 키와 일치하는 요소의 인덱스 반환
            else if (array[mid] < key)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1; // 검색 실패 시 -1 반환
    }



    public static void main(String[] args) {
        int[] iarr = {1,3,5,33,56,2,44};

        int index = sequentialSearch(iarr,33);

        if (index != -1) {
            System.out.println("당신이 찾는 데이터의 인덱스값은 " + index + "번째 인덱스에 있습니다." );
        } else {
            System.out.println("당신이 찾는 데이터는 존재하지 않습니다.");
        }

        Arrays.sort(iarr);

        int resultIndex = binarySearch(iarr, 33);
        System.out.println(resultIndex);
    }
}
