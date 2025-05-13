package tutorial04;

public class Q1 {

    public static void main(String[] args) {
        LinkedList<Character> list = new LinkedList<>();

        // Question 1(a)
        Node<Character> node1 = new Node<>('a');
        Node<Character> node2 = new Node<>('z');
        list.head = node1;
        list.tail = node2;

        // Question 1(c)
        node1.next = node2;

        // Question 1(d)
        Node<Character> firstNode = new Node<>('g');
        firstNode.next = list.head;
        list.head = firstNode;

        list.addFirst('f');
        list.addLast('c');
        list.add(2, 'd');
        list.removeFirst();
        list.removeLast();
        list.remove(1);
    }
}
