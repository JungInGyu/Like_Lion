package day15.Test;


class IncrementCounter implements Runnable {
    @Override
    public void run() {


    }
}


public class CounterApp {
    public static void main(String[] args) {
        Thread incrementThread = new Thread(new IncrementCounter());
//        Thread decrementThread = new Thread(new DecrementCounter());

        incrementThread.start();
//        decrementThread.start();
    }


}
