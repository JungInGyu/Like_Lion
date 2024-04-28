package day18;

public class MyFunctionalInterfaceTest {
    public static void main(String[] args) {
        MyFunctionalInterface myFunctionalInterface;
        MyFunctionalInterfaceImpl myFunctionalInterfaceimpl = new MyFunctionalInterfaceImpl();

        myFunctionalInterface = new MyFunctionalInterface() {
            @Override
            public void method1() {
                System.out.println("method 1 call");
            }

//            @Override
//            public void method2() {
//                System.out.println("method 2 call");
//            }
        };

        myFunctionalInterface.method1();
        myFunctionalInterfaceimpl.method1();

        myFunctionalInterface = () -> System.out.println("method111");
        myFunctionalInterface.method1();

        myFunctionalInterface = () -> System.out.println("method111222");
    }
}

class MyFunctionalInterfaceImpl implements MyFunctionalInterface{

    @Override
    public void method1() {
        System.out.println("method1");
    }

//    @Override
//    public void method2() {
//        System.out.println("method2");
//    }
}