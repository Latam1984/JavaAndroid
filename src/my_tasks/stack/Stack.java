package my_tasks.stack;

import java.util.Scanner;

/**
 * Created by Aleksey on 16.03.2017.
 */
public class Stack {
    private static int mSize;
    private static int[] stack;
    private static int top;


    public Stack(int mSize) {
        this.mSize = mSize;
        stack = new int[mSize];
        top = 0;
    }


    public void isFull() {
        if (stack.length == top) {
            System.out.println("Stack is full");
        } else {
            System.out.println("Stack is not full");
        }
    }

    public void isEmpty() {
        if (top == -1) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("Stack size " + top);
        }

    }

    public void readTop() {
        System.out.println(stack[top]);
    }

    public int deleteElement(int delElement) {
        stack[delElement] = 0;
        System.out.println("Element number " + delElement);
        return stack[top--];
    }

    public void addElevemnt() {
        Scanner sc = new Scanner(System.in);
        int addElement = sc.nextInt();
        stack[top++] = addElement;
        System.out.println("Element " + addElement + " add to stack successful");
    }

    public int getmSize() {
        return mSize;
    }

    public void setmSize(int mSize) {
        this.mSize = mSize;
    }

    public int[] getStack() {
        return stack;
    }

    public void setStack(int[] stack) {
        this.stack = stack;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }
}
