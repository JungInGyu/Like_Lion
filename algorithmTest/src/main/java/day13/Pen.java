package day13;

import java.util.Objects;

public class Pen {
    String color;

    int price;

    public Pen(String color, int price) {
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "펜의 색깔은: "+color+" 가격은: "+price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pen pen)) return false;
        return Objects.equals(color, pen.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color);
    }
}
