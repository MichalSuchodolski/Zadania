package Zadanie5;

public class Node<T> {
    private T value;
    private Node<T> next;
    public T getValue() {
        return value;
    }
    public Node<T> getNext() {
        return next;
    }
    public void setValue(T value) {
        this.value = value;
    }
    public Node(T value) {
        this.value = value;
    }
    public void setNext(Node<T> next) {
        this.next = next;
    }


    }




