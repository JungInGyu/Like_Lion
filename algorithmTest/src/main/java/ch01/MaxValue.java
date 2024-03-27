package ch01;

public class MaxValue {
    // 메소드 구성
    // 접근제한자 리턴타입 메소드명 (매개변수들...){구현..}
    public static int max(int a, int b, int c){

        if (a > b) {
            if (a > c){
                return a;
            } else {
                return c;
            }
        } else {
            if (b > c){
                return b;
            } else {
                return c;
            }
        }
    }

    // main 메소드에서 문제를 해결했었음


    public int mid_val(int a , int b ,int c){

        if (a > b){
            if (b > c){
                return b;
            } else if (b < c && c < a) {
                return c;
            } else if (b < c && c > a) {
                return a;
            } else if (b > a){
                if (a > c){
                    return a;
                } else if (a < c && c < b){
                    return c;
                } else {
                    return b;
                }
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        MaxValue maxValue = new MaxValue();
        System.out.println(max(9999,89,886));
        System.out.println(maxValue.mid_val(9,89,886));
    }

}
