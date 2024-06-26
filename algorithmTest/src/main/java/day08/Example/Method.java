package day08.Example;




public class Method {
//    실습 문제 1: 기본 상속 구현하기
//    문제 설명:
//    자동차를 모델링하는 기본 클래스 Car가 있습니다. 이 클래스는 다음과 같은 필드와 메서드를 가지고 있습니다:
//
//    필드: brand(브랜드), model(모델), year(연식)
//    메서드: displayInfo() - 자동차의 정보를 출력
//    Car 클래스를 상속받아 ElectricCar 클래스를 생성하고, ElectricCar에는 배터리 용량을 나타내는 batteryCapacity 필드와 이를 포함한 정보를 출력하는 displayInfo() 메서드를 오버라이딩하여 추가합니다.
//
//    요구 사항:
//
//    Car 클래스를 정의하고 기본 정보를 출력하는 displayInfo() 메서드 구현
//    Car 클래스를 상속받는 ElectricCar 클래스를 정의
//    ElectricCar에 batteryCapacity 필드 추가 및 displayInfo() 메서드 오버라이딩
//    main 메서드에서 Car와 ElectricCar 객체를 생성하여 각각의 displayInfo() 메서드를 호출하여 테스트


    public static void main(String[] args) {
        // Car 클래스의 인스턴스 생성
        Car car = new Car("Hyundai", "Sonata", 2020);
        car.displayInfo();

        // ElectricCar 클래스의 인스턴스 생성
        ElectricCar electricCar = new ElectricCar("Tesla", "Model S", 2021, 75);
        electricCar.displayInfo();
    }
}
