package ch07;

public class Test {
    public static void main(String[] args) {
        System.out.println(ClassA.fieldA);   // 클래스 필드

        ClassA classA = new ClassA();
        System.out.println(classA.fieldB);  // 인스턴스 필드


    }
}
