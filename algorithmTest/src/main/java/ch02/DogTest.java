package ch02;

public class DogTest {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.breed="말티푸";
        dog.age = 5;
        dog.color = "Brown";
        dog.bark();
        dog.displayInfo();

        Dog dog2 = new Dog("푸들","갈색");
        dog2.age = 10;

        dog2.displayInfo();

        notebook notebook = new notebook();
        notebook.name = "LG그램";
        notebook.color= "흰색";
        notebook.price=1300000;

        notebook.displayinfo();

        notebook note2 = new notebook("삼성 오딧세이","검정색",1500000);
        note2.displayinfo();

    }
}
