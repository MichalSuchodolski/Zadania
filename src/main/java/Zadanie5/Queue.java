package Zadanie5;

public class Queue <T> implements StackQueue<T> {


        private Node<T> front;
        private Node<T> back;
        private int counter = 0;
        private int a,b;
        private String sign;
        @Override
        public void push(Object value) {
            if (isEmpty() == true) {
                back = new Node<T>((T) value);
                front = back;
                counter++;
            } else {
                Node<T> tNode = new Node(value);
                back.setNext(tNode);
                back = tNode;
                counter++;
            }
        }



    @Override
        public T pop() {
            if (front != null) {
                T t = front.getValue();
                if (front == back) {
                    front = null;
                    back = null;
                    counter--;
                }else {
                    front = front.getNext();
                }
                counter--;
                return t;
            }
            return null;
        }
        @Override
        public T peek () {
            return front.getValue();
        }
        @Override
        public int size () {
            return counter;
        }
        @Override
        public boolean isEmpty () {
            //return front == null && back == null; alternatywna opcja
            if (front == null && back == null) {
                return true;
            }
            return false;
        }



}
