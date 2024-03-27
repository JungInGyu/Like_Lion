package com.example.day01.day02;

class Book {
    private String title;
    private int price;
    private String book_name;

    // 메소드 (method)
    // 접근제한자 리턴타입 메소드명(매개변수들... ){  구현  }
    // 필드의 값을 수정하기 위한 메소드는 setter 열기위해서는 getter
    // setter, getter - 프로퍼터(property) - price 프러퍼터
    public String getTitle() {
        return this.title;
        // this.이 붙는 이유는 정확히 속성을 알려주기 위함
        // 여기서 this 가 붙으면 위에 private string 의 title을 리턴함
    }

    // void가 붙은 이유는 return타입이 필요 없기 때문
    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBook_name() {
        return this.book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }
}
