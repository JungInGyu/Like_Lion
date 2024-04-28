package day09;

public interface Drawble {

    default public void draw(){
        System.out.println("도형을 그립니다.");
    }

    default public void test(){
        System.out.println("test 입니다.");
    }
}
