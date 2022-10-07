
class Stack {
    int capacity;
    int top;
    int a[];

    Stack(int capacity) {
        this.capacity = capacity;
        top = -1;
        a = new int[capacity];
    }

    boolean push(int x) {
        if (top == (capacity - 1)) {
            System.out.println("Stack Overflow.");
            return false;
        } else {
            a[++top] = x;
            System.out.println(x + " has been pushed.");
            return true;
        }
    }

    int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow.");
            return Integer.MIN_VALUE;
        } else {
            return a[top--];
        }
    }

    int getSize() {
        return top + 1;
    }

    int peek() {
        if (top == -1) {
            System.out.println("Stack Underflow.");
            return Integer.MIN_VALUE;
        }
        return a[top];
    }

    Boolean isFull() {
        if (top == (capacity - 1))
            return true;
        else
            return false;
    }

    Boolean isEmpty() {
        if (top == -1)
            return true;
        else
            return false;
    }

    // NOT ALLOWED IN STACK, JUST TO CHECK IMPLEMENTATION
    void displayStack() {
        if (top != -1) {
            for (int i = top; i > -1; i--)
                System.out.print(a[i] + "\t");
        }
        System.out.print("\n");
    }

}

class Main {
    public static void main(String args[]) {
        Stack s = new Stack(5);
        s.push(5);
        s.push(10);
        s.push(15);
        s.push(20);
        s.displayStack();
        System.out.println(s.pop() + " has been popped.");
        System.out.println(s.pop() + " has been popped.");
        System.out.println(s.getSize());
        System.out.println(s.peek() + " is at the top.");
        s.displayStack();
        s.push(52);
        s.push(13);
        s.push(14);
        s.displayStack();
        System.out.println(s.getSize());
        System.out.println(s.peek() + " is at the top.");
        System.out.println(s.isEmpty() ? "Stack is Empty!" : "Stack isn't Empty!");
        System.out.println(s.isFull() ? "Stack is Full!" : "Stack isn't Full!");
    }
}