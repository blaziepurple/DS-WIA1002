package tutorial04;

public class Node<E> {

    E element;
    Node<E> next;

    Node(E element) {
        this.element = element;
        this.next = null;
    }
}
