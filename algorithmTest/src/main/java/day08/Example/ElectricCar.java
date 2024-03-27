package day08.Example;

public class ElectricCar extends Car{
    int batteryCapacity;

    public ElectricCar(String brand, String model, int year, int batteryCapacity) {
        super(brand,model,year);
        this.batteryCapacity = batteryCapacity;

    }



    @Override
    public void displayInfo() {
        System.out.println("브랜드: "+brand +"\n"+"모델: "+model+"\n"+"년도: "+year+"\n"+"배터리: "+batteryCapacity);
    }
}
