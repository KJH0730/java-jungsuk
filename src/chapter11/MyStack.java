package chapter11;

import java.util.EmptyStackException;
import java.util.Vector;

public class MyStack extends Vector {
    public Object push(Object item) {
        addElement(item);
        return item;
    }

    public Object pop() {
        Object obj = peek();
        removeElementAt(size() - 1);
        return obj;
    }

    public Object peek() {
        int len = size();

        if(len == 0)
            throw new EmptyStackException();
        return elementAt(len - 1);
    }

    public boolean empty() {
        return size() == 0;
    }

    public int search(Object o) {
        int i = lastIndexOf(o);

        if(i >= 0) {
            return size() - i;
        }
        return -1;
    }

    public static void main(String[] args) {
        MyStack stack = new MyStack();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(stack.size());
        System.out.println(stack.lastIndexOf(1));
        System.out.println(stack.size() - stack.lastIndexOf(1));
        System.out.println(stack.search(1));


    }
}
