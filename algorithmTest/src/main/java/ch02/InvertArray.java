package ch02;
class InvertArray {
    static void swap(int[] a, int idx1, int idx2){
        int temp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = temp;
    }

    static void reverse(int[] a){
        for (int i = 0; i < a.length / 2; i++){
            swap(a, i, a.length - i - 1);
        }
    }


   public static boolean areArraysEqual(int[] a, int[] b){
        if (a.length == b.length) {
            for (int i : a){
                if (a[i] == b[i]){
                    return true;
                }
            }
        } return false;
   }
    public static void main(String[] args) {
        // 테스트를 위한 두 배열 선언
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {1,2,3,4,5};
        int[] array3 = {1,2,3,4};

        // areArraysEqual 메소드를 사용하여 배열 비교
        System.out.println("array1과 array2는 동일한가? " + areArraysEqual(array1, array2));
        System.out.println("array1과 array3는 동일한가? " + areArraysEqual(array1, array3));
    }
}
