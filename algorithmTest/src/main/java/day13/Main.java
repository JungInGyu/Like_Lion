package day13;

import java.util.*;

class Book implements Comparable<Book>{
    private String bookName;
    private String perName;
    private int year;

    public Book(String bookName, String perName, int year) {
        this.bookName = bookName;
        this.perName = perName;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", perName='" + perName + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;
        return year == book.year && Objects.equals(bookName, book.bookName) && Objects.equals(perName, book.perName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, perName, year);
    }

    @Override
    public int compareTo(Book o) {
        return this.year - o.year;
    }
}
class BookManager{
    List<Book> list = new ArrayList<>();
    public void addBook(Book book){
        if (!list.contains(book)){
            list.add(book);
            System.out.println("추가완료" +book);
        } else{
            System.out.println("이미 존재하는 책입니다.");
        }

    }


    public void displayBooks() {
        for (Book arr : list){
            System.out.println(arr);
            System.out.println("=================");
        }
    }

    public void sortBooksByYear() {
        Collections.sort(list);
    }

    public void removeBooks(Book book) {
        if(!list.contains(book)){
            System.out.println("삭제 할 수 없습니다.");
        } else {
            System.out.println("삭제를 완료하였습니다: " + book);
            list.remove(book);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        BookManager manager = new BookManager();
        manager.addBook(new Book("모두의 자바", "강경미", 2015));
        manager.addBook(new Book("이것이 자바다", "신용권", 2018));
        manager.addBook(new Book("자바의 정석", "남궁성", 2013)); // 중복 추가 시도
        manager.addBook(new Book("모두의 자바", "강경미", 2015));
        manager.displayBooks();
        manager.removeBooks(new Book("이것이 자바다", "신용권", 2018));
        manager.sortBooksByYear();
    }
}
