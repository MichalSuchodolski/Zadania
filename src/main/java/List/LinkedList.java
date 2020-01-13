package List;

import java.util.Optional;

public class LinkedList<T extends Comparable<T>> implements List<T> {

    private Node<T> head;
    private Node<T> tail;
    private int counter = 0;


    @Override
    public void add(T object) {
        if (counter == 0) {
            tail = new Node<T>((T) object);
            head = tail;
            counter++;
        } else {
            Node<T> tNode = new Node<T>((T) object);
            tail.setNext(tNode);
            tNode.setPrevious(tail);
            tail = tNode;
            counter++;

        }


    }

    @Override
    public T get(int index) {
        Node<T> tempNodeGetValue = null;
        if (index > size()) {
            System.out.println(" Nie ma takiego numeru ");
            return null;
        } else {
            tempNodeGetValue = head;
            for (int i = index; i > 0; i++) ;
            tempNodeGetValue = tempNodeGetValue.getNext();
        }

        return tempNodeGetValue.getValue();
    }

    public Optional<Node<T>> find(T value) {
        Node<T> temporary = head;

        while (temporary != null) {
            if (temporary.getValue().equals(value)) {
                return Optional.of(temporary);
            }
            temporary = temporary.getNext();
        }
        return Optional.empty();

    }


    @Override
    public boolean remove(T object) {

        Node<T> temp = head;

        if (head == null && tail == null) {
            return false;
        }


        if (head == temp && tail == temp) {
            head = null;
            tail = null;
            counter--;
            return true;
        }

        if (object.equals(head)) {
            head.getNext().setPrevious(null);
            counter--;
            return true;
        }

        if (object.equals(tail)) {
            tail.getPrevious().setNext(null);
            counter--;
            return true;
        }
        Optional<Node<T>> maybeNode = find(object);

        if (maybeNode.isPresent()) {
            Node<T> found = maybeNode.get();
            Node<T> previous = found.getPrevious();
            Node<T> next = found.getNext();
            previous.setNext(next);
            next.setPrevious(previous);
            counter--;
            return true;
        }


        return false;
    }

    @Override
    public boolean addBefore(T before, T value) {
        Node<T> newNode = new Node<T>(value);
        Optional<Node<T>> maybeNode = find(before);
        if (maybeNode.isPresent()) {
            Node<T> found = maybeNode.get();
            if (found.getValue().equals(head.getValue())) {
                head = newNode;
            }
            Node<T> previous = found.getPrevious();
            newNode.setPrevious(previous);
            newNode.setNext(found);
            previous.setNext(newNode);
            found.setPrevious(newNode);
            counter++;
            return true;


        }
        return false;
    }

    @Override
    public boolean addAfter(T after, T value) {
        Node<T> newNode = new Node<T>(value);
        Optional<Node<T>> maybeNode = find(after);
        if (maybeNode.isPresent()) {
            Node<T> found = maybeNode.get();
            if (found.getValue().equals(tail.getValue())) {
                newNode.setNext(tail);
                tail = newNode;
            }
            Node<T> next = found.getNext();
            newNode.setNext(next);
            newNode.setPrevious(found);
            next.setPrevious(newNode);
            found.setNext(newNode);
            counter++;
            return true;


        }


        return false;
    }

    @Override
    public void clear() {
        head = null;
        tail = null;
        counter = 0;

    }

    @Override
    public Object[] asArray() {
        Object[] tab = new Object[counter];
        Node<T> temp = head;
        for (int i = 0; i < counter;i++){
            tab[i] = temp.getValue();
            temp = temp.getNext();
        }


        return new Object[0];

    }

    @Override
    public int size() {
        return size();
    }
}