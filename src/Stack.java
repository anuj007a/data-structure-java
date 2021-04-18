public class Stack {

    int stack[] = new int[5];
    int top = 0;

    public void push(int data) {
        if (top == 5) {
            System.out.println("Can't push, Stack is full.");
            return;
        }
        stack[top] = data;
        top++;
    }

    public int pop() {
        int data = 0;
        if (isEmpty()) {
            System.out.println("Can't pop, Stack is empty.");
        } else {
            top--;
            data = stack[top];
            stack[top] = 0;
        }
        return data;

    }

    public int peek() {
        int data;
        data = stack[top - 1];
        return data;
    }

    public int size() {
        return top;
    }

    public boolean isEmpty() {
        return top <= 0;
    }

    public void show() {
        System.out.print("Value in stack are: ");
        for (int n : stack) {
            System.out.print(n + " , ");
        }
        System.out.println();

    }

}

class StackRunner {
    public static void main(String[] args) {
        Stack stack = new Stack();
        System.out.println(stack.isEmpty() == true ? "Stack is empty." : "Stack is not empty.");
        stack.pop();
        stack.push(10);
        stack.push(9);
        stack.push(8);
        stack.push(7);
        stack.push(6);
        stack.push(5);
        System.out.println("Size of stack is: " + stack.size());
        System.out.println("Stack peek value is: " + stack.peek());
        stack.show();
        System.out.println("Value pop from stack is: " + stack.pop());
        System.out.println("Size of stack is: " + stack.size());
        System.out.println("Stack peek value is: " + stack.peek());
        stack.show();
        System.out.println("Size of stack is: " + stack.size());
        System.out.println(stack.isEmpty() == true ? "Stack is empty." : "Stack is not empty.");
    }
}


