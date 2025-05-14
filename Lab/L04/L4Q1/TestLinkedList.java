package q1;

public class TestLinkedList {

    public static void main(String[] args) {
        MyLinkedList<String> linkedList = new MyLinkedList<>();

        linkedList.addLast("a");
        linkedList.addLast("b");
        linkedList.addLast("c");
        linkedList.addLast("d");
        linkedList.addLast("e");

        linkedList.print();
        linkedList.reverse();

        System.out.println("Number of items in the list: " + linkedList.getSize());

        System.out.println("First item: " + linkedList.getFirst());
        System.out.println("Last item: " + linkedList.getLast());

        System.out.println("Deleting the third value");
        linkedList.remove(2);
        linkedList.print();

        System.out.println("Index location of 'b': " + linkedList.indexOf("b"));
        System.out.println("Index location of 'c': " + linkedList.indexOf("c"));

        System.out.println("Is 'c' in the list?: " + linkedList.contains("c"));

        linkedList.set(0, "j");
        linkedList.set(1, "a");
        linkedList.set(2, "v");
        linkedList.set(3, "a");

        linkedList.print();

    }
}
