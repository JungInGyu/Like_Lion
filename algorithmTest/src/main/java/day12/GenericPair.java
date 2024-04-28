package day12;

public class GenericPair <T1,T2>{
    private T1 first;
    private T2 second;

    public GenericPair(T1 first, T2 second) {
        this.first = first;
        this.second = second;
    }

    public T1 getFirst() {
        return first;
    }

    public void setFirst(T1 first) {
        this.first = first;
    }

    public void setSecond(T2 second) {
        this.second = second;
    }

    public T2 getSecond() {
        return second;
    }


    public static void main(String[] args) {
        GenericPair<String, Integer> pair = new GenericPair<>("hello",4);
        String first = pair.getFirst(); // 캐스팅 불필요
        Integer second = pair.getSecond(); // 캐스팅 불필요
    }
}
