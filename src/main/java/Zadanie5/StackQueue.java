package Zadanie5;

public interface StackQueue<T> {


        void push(T value);
        T pop();
        T peek();
        int size();
        boolean isEmpty();

}
