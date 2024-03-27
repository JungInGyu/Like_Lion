package ch02;

public class notebook {
    String name;
    String color;
    int price;

    void displayinfo(){
        System.out.println("기종: " + name + " 색상: "+color+" 가격: "+price);
    }

    notebook (String name, String color, int price){
        this.name = name;
        this.color = color;
        this.price = price;
    }
    public notebook(){

    }
}
