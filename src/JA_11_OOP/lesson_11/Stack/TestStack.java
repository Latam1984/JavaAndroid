package JA_11_OOP.lesson_11.Stack;

/**
 * Created by Aleksey on 10.03.2017.
 */
public class TestStack {
    public static void main(String[] args) {
        MyStack myStack = new MyStack(10);

        for (int i = 0; i < 10; i++) {
            myStack.push(i*i);
        }
        System.out.println(myStack);
        while (!myStack.isEmpty()){
            System.out.println();
        }
    }
}
