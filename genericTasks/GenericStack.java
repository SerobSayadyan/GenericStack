package genericTasks;

import java.util.ArrayList;

public class GenericStack<T> {

    private ArrayList<T> stack = new ArrayList<>();

    private int size = 0;

    public void push(T element) {
        stack.add(element);
        size++;
    }

    public T pop() {
        if (isEmpty()){
            throw new RuntimeException("The Stack is EMPTY");
        }
        return stack.get(--size);
    }

    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("The Stack is EMPTY");
        }
        return stack.get(size - 1);
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
