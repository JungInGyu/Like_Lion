package ch04;

class StackExample {
    private int maxsize;
    private int[] stackArray;
    private int top;
    private int bottom;

    public StackExample(int maxsize1) {
        this.top = -1;
        this.maxsize = maxsize1;
        this.stackArray = new int[maxsize1];
        this.bottom = 0;
    }

    public void push(int num) {
        if (maxsize >= stackArray.length) {
            stackArray[++top] = num;
        } else {
            System.out.println("스택이 가득 찼습니다.");
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("스택이 비었습니다.");
        }
        int temp = stackArray[top];
        stackArray[top] = stackArray[top--];
        return temp;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("스택이 비었습니다.");
        }
        int temp = stackArray[top];
        return temp;
    }

    public void enqueue(int num) {
        if (maxsize >= stackArray.length) {
            stackArray[++top] = num;
        } else {
            System.out.println("스택이 가득 찼습니다.");
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("스택이 비었습니다.");
        }
        int temp = stackArray[bottom];
        stackArray[bottom] = stackArray[bottom-1];
        return temp;
    }

    public boolean isEmpty() {
        return top == -1;
    }


    public static void main(String[] args) {
        StackExample stack = new StackExample(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
        System.out.println(stack.dequeue());
    }
}
