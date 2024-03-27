package ch07;

public class ClassA {
    public static int fieldA; // 클래스 필드

    public int fieldB; //인스턴스 필드


    int count;
    protected int number;
    private String address;

    public String name;


    public void print(){
        System.out.println(name);
        System.out.println(number);
        System.out.println(address);
        System.out.println(count);
    }

    public static void main(String[] args) {
        ClassA a = new ClassA();
        System.out.println(a.address);
    }
}
