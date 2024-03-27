package day08.Example;

public class Car {
    String brand;
    String model;
    int year;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void displayInfo(){
        System.out.println("브랜드: "+brand +"\n"+"모델: "+model+"\n"+"년도: "+year);
    }
}
