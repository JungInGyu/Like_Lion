package day12;

public class Box <V>{
    private V vlaue;

    public Box(V vlaue) {
        this.vlaue = vlaue;
    }

    public V getVlaue() {
        return vlaue;
    }

    public void setVlaue(V vlaue) {
        this.vlaue = vlaue;
    }

    public static void main(String[] args) {
        Box<String> strBox = new Box<>("Hello");

        String str = strBox.getVlaue();

        System.out.println(str);

        Box<Integer> numbox = new Box<>(1);

        int num = numbox.getVlaue();

        System.out.println(num);
    }
}
