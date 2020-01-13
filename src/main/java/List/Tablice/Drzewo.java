package List.Tablice;
import List.Node;

public class Drzewo extends Node {

    private Node root = null;
    int key;
    Node left, right, parent = null;

    public Drzewo(Object value) {
        super(value);
    }

    void Node(int key) {
        this.key = key;


    }
}