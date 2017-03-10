package JA_11_OOP.lesson_11.Stack;

import java.util.Arrays;

/**
 * Created by Aleksey on 10.03.2017.
 */
public class MyStack {
    private int size;
    private int index;
    private int[] items;

    public MyStack(int count) {
        this.items = new int[count];
        this.index = -1;
    }

    public boolean push(int item) {
        if (index == items.length - 1) {
            System.out.println("Stack full!");
            return false;
        }
        items[++index] = item;
        return true;
    }

    public int pop() {
        if (index < 0) {
            System.out.println("Stack is empty!");
            return 0;
        }
        return items[index--];
    }

    public boolean isEmpty() {
        return index < 0;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MyStack{");
        sb.append("size=").append(size);
        sb.append(", index=").append(index);
        for (int i = 0; i < index ; i++) {
        sb.append(" ").append(items[i]);
        }
        sb.append(", items=").append(Arrays.toString(items));
        sb.append('}');
        return sb.toString();
    }
}
