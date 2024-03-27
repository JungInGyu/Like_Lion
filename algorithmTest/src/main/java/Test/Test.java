package Test;

import ch07.ClassA;

public class Test extends ClassA{

    public int getNumber() {
        return number;
    }

    public void print(ClassA a){
        System.out.println(a.name);

    }

    public static void main(String[] args) {

        ClassA a = new ClassA();
//        System.out.println(a.address);  //private
//        System.out.println(a.count);    //package
//        System.out.println(a.number);   //protected
        System.out.println(a.name);     //public
    }
}