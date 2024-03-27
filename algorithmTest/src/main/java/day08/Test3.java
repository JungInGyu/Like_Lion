package day08;

public class Test3 {


    public static void m1(Child obj){

    }

    public static void main(String[] args) {
        //1. 부모는 자식을 가리킬 수 있다.
        // 조상은 자손을 가리킬 수 있다.
        // 모든 클래스는 Object를 상속 받고 있기 때문에 오브젝트는 모든 클래스를 상속 할 수 있음.
        Parent p = new Child();
        Object obj = new Child();
        Object obj2 = new Parent();


        m1((Child) p);
        m1((Child) obj);
        m1((Child) obj2);

        //
//        System.out.println(obj.i);
//
//        System.out.println(((Child)obj).i);
//        System.out.println(obj.geti());

        Child c =(Child)obj;
        System.out.println(c.i);
        System.out.println(c.getI());

        byte b = 4;
        int i = b; //묵시적 형변환
        b = (byte) i ; // 명시적 형변환

        Object bbb = new Child();

        if (bbb instanceof Child) {
            Child ccc = (Child) bbb;
            System.out.println("형변환 완료!!");
        }
    }
}
