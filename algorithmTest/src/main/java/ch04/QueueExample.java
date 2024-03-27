package ch04;

import java.util.Arrays;

class QueueExample {
    private int maxsize;
    private int[] queueArray;
    private int front;
    private int rear;
    private int count;

    public QueueExample(int maxsize){
        this.maxsize = maxsize;
        queueArray = new int[maxsize];
        front = 0;
        rear = 0;
        count = 0;

    }

    public void enqueue(int num){
        queueArray[rear++] = num;
        count++;
    }

    public int dequeue(){
        int num = queueArray[front];
        front = (front + 1) % maxsize;
        count--;
        return num;
    }

    public int peek(){
        return queueArray[front];
    }

    public boolean isEmpty(){
        return count == 0;
    }

    public static void main(String[] args) {
        QueueExample queue = new QueueExample(5);
        queue.enqueue(1);
        queue.enqueue(3);
        queue.enqueue(5);
        System.out.println(queue.dequeue());
        System.out.println(queue.peek());
        System.out.println(queue.isEmpty());
    }
}
// 원형 인덱스