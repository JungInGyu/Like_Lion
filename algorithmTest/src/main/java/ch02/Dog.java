package ch02;

class Dog {
    // 필드
    String breed;
    int age;
    String color;
    // 메서드

    Dog(String breed,String color){
        this.breed = breed;
        this.color = color;
    }

    public Dog() {

    }

    void bark() {
        System.out.println("Woof!");
    }
    void displayInfo() {
        System.out.println("Breed: " + breed + " Age: " + age + " Color: " + color);
    }

    static void classMethod(){
        System.out.println("클래스 메서드는 인스턴스화 하지 않아도 사용할 수 있어요.");
    }

    void instanceMethod(){
        System.out.println("인스턴스 메소드는 반드시 인스턴스화 한 후 사용 할 수 있어요.");
    }

    public static void main(String[] args) {
        Dog.classMethod(); //클래스로 바로 접근해서 사용이 가능

        Dog dog = new Dog();
        dog.instanceMethod(); //인스턴스를 통해서만 접근가능!!
    }
}
