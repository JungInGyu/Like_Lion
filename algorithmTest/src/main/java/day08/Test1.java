package day08;

public class Test1 {
    public static void main(String[] args) {
        // 상속의 개념
        Parent parent = new Parent();
        System.out.println(parent.i);
        System.out.println(parent.getI());

        // Child는 아무것도 가지고 있지 않지만 Parent를 상속받아
        // 동일한 값이 출력됨
        Child child = new Child();
        System.out.println(child.i);
        System.out.println(child.getI());
        System.out.println(child.getClass().getName());
    }
}
