package day11;

public class OuterClass {
    private int outerField =10;
    private InnerClass innerClass;

    private void outerMethod(){
        InnerClass inner = new InnerClass();
        inner.innerMethod();
    }

    class InnerClass{
        public void innerMethod(){
            System.out.println("outerField = " + outerField);
        }
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.outerMethod();
    }
}
