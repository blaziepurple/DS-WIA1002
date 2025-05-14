package q1;

/**
 * Generic node class to represent a node
 */
public class Node<E> {

    E element; // contains the element
    Node<E> next; // a reference to the next node

    // default constructor
    public Node() {
    }

    // constructor with parameter
    public Node(E element) {
        this.element = element;
    }

}
