package day12;

public class Pair <K,V>{
    private K Key;
    private V value;

    public Pair(K key, V value) {
        this.Key = key;
        this.value = value;
    }

    public K getKey() {
        return Key;
    }

    public void setKey(K key) {
        Key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public static void main(String[] args) {
        Pair<String,Integer> pair = new Pair<>("Age",25);

        String str = pair.getKey();
        int age = pair.getValue();
        System.out.printf("제 %s는: %d",str,age);

    }

}
