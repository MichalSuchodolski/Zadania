package List;

public class Test {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        System.out.println(linkedList.size());
        linkedList.remove(2);
        System.out.println(linkedList.size());

    }
}
