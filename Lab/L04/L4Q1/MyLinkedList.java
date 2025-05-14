package q1;

/**
 * MyLinkedList class to represent a linked list
 */
public class MyLinkedList<E> {

    private Node<E> head;
    private Node<E> tail;
    private int size;

    // default constructor
    public MyLinkedList() {
        size = 0;
    }

    /**
     * Adds an item at the front of the linked list
     *
     * @param e the item to be added
     */
    public void addFirst(E e) {
        Node<E> newNode = new Node<>(e);
        newNode.next = head; // link the newly created node with the old head
        head = newNode; // set the head node as the newly created node
        size++;
        if (tail == null) { // list is empty 
            tail = head;
        }
    }

    /**
     * Add an item at the end of the linked list
     *
     * @param e the item to be added
     */
    public void addLast(E e) {
        Node<E> newNode = new Node<>(e);
        size++;

        if (tail == null) { // list is empty
            head = tail = newNode;
        } else {
            tail.next = newNode; // link the previous tail with the newly created node
            tail = tail.next; // set the tail node as the next node of the newly created node
        }

    }

    /**
     * Add an item in the middle of the linked list
     *
     * @param index the position to add the item into
     * @param e the item to be added
     */
    public void add(int index, E e) {
        if (index == 0) { // at the beginning of the list
            addFirst(e);
        } else if (index == size - 1) { // at the end of the list
            addLast(e);
        } else {
            Node<E> newNode = new Node<>(e);
            Node<E> current = head; // create a current node and set it as the head
            for (int i = 0; i < index; i++) {
                current = current.next; // traverse through the list until before the specified index
            }
            Node<E> temp = current.next; // hold the reference to current.next to temp
            current.next = newNode; // set the new node as the next node to current
            (current.next).next = temp; // get the reference of temp and set it as the next node for the new node
            size++;
        }
    }

    /**
     * Remove the first item in the linked list
     *
     * @return the first item in the list
     */
    public E removeFirst() {
        if (size == 0) {
            return null; // list is empty
        } else {
            Node<E> temp = head; // set a reference value to the head of the list
            head = head.next; // set the new head node
            size--;

            if (head == null) { // if only 1 item in the list
                tail = null;
            }

            return temp.element;
        }

    }

    /**
     * Removes the last item in the linked list
     *
     * @return the last item in the list
     */
    public E removeLast() {
        if (size == 0) {
            return null; // list is empty
        } else if (size == 1) { // if only 1 item in the list
            Node<E> temp = head;
            head = tail = null;
            size--;
            return temp.element;
        } else {
            Node<E> current = head;
            for (int i = 0; i < size - 2; i++) {
                current = current.next; // iterate trhough the list until the node before tail
            }

            Node<E> temp = tail;
            tail = current; // set the current node as the tail
            tail.next = null; // set the next node of the tail as null
            size--;
            return temp.element;
        }
    }

    /**
     * Removes the item at the specified index in the linked list
     *
     * @param index the location of the item to be removed
     * @return the item at the requested index
     */
    public E remove(int index) {
        if (index < 0 || index >= size) {
            return null; // invalid index
        } else if (index == 0) {
            return removeFirst(); // first item in the list
        } else if (index == size - 1) {
            return removeLast(); // last item in the list
        } else {
            Node<E> previous = head;

            for (int i = 1; i < index; i++) {
                previous = previous.next; // iterate through the list to before the specified index
            }

            Node<E> current = previous.next; // copy the next node of previous to current
            previous.next = current.next; // set the next node of previous to the node after the specified index
            size--;
            return current.element;
        }
    }

    /**
     * Checks if the specified item is in the list
     *
     * @param e the item to be checked in the list
     * @return true if e is in the list, false otherwise
     */
    public boolean contains(E e) {
        Node<E> current = head;

        // iterate through the list
        for (int i = 0; i < size; i++) {
            if (current.element.equals(e)) { // if e matches the current node return true
                return true;
            }
            current = current.next;
        }

        return false;
    }

    /**
     * Return the item at the specified index
     *
     * @param index the index of the item
     * @return the item at the specified index
     */
    public E get(int index) {
        Node<E> current = head;

        // Iterate through the list to the specified index
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        return current.element;
    }

    /**
     * Gets the first item in the linked list
     *
     * @return the first item in the list, null if it doesn't exist
     */
    public E getFirst() {
        if (size == 0) {
            return null; // list is empty
        }

        Node<E> first = head;
        return first.element;
    }

    /**
     * Gets the last item in the linked list
     *
     * @return the last item in the list, null if it doesn't exist
     */
    public E getLast() {
        if (size == 0) {
            return null;
        }

        Node<E> current = head;
        for (int i = 0; i < size - 1; i++) {
            current = current.next;
        }

        return current.element;
    }

    /**
     * Gets the index of a specified item in the list
     *
     * @param e the item to be searched in the list
     * @return the index of the item in the list, -1 if no match
     */
    public int indexOf(E e) {
        Node<E> current = head;

        for (int i = 0; i < size; i++) {
            if (current.element.equals(e)) {
                return i;
            }
            current = current.next;
        }

        return -1;
    }

    public int lastIndexOf(E e) {
        Node<E> current = head;
        int max = 0;
        boolean found = false;

        for (int i = 0; i < size; i++) {
            if (current.element.equals(e)) {
                max = i;
                found = true;
            }
            current = current.next;
        }

        if (!found) {
            return 1;
        }

        return max;
    }

    /**
     * Replaces an item at a specified index in the list with a specified item
     *
     * @param index the index of the item to be replaced
     * @param e the item to replace the current item
     * @return the item that was replaced
     */
    public E set(int index, E e) {
        if (index < 0 || index >= size) {
            return null; // invalid index
        } else if (index == 0) { // replacing the first item in the list
            E temp = removeFirst();
            addFirst(e);
            return temp;
        } else if (index == size - 1) { // replacing the last item in the list
            E temp = removeLast();
            addLast(e);
            return temp;
        } else {
            add(index, e); // call add() to add the item in the list
            return remove(index); // remove the item in the specified index
            // the item when added would be added to the node after the specified index
            // so remove(index) is called to remove the intended item to be removed
        }
    }

    /**
     * Clears the list
     */
    public void clear() {
        while (size != 0) {
            removeFirst();
        }
    }

    /**
     * Prints all of the elements in the list
     */
    public void print() {
        Node<E> current = head;

        for (int i = 0; i < size; i++) {
            System.out.print(current.element + " ");
            current = current.next;
        }
        System.out.println();
    }

    /**
     * Prints all of the elements in the list in reverse order
     */
    public void reverse() {
        for (int i = size - 1; i >= 0; i--) { // start at the end of the list
            Node<E> current = head;
            for (int j = 0; j < i; j++) { // goes up to i
                current = current.next;
            }
            System.out.print(current.element + " ");
        }
        System.out.println();
    }

    /**
     * Get the number of items in the list
     *
     * @return the number of items in the list
     */
    public int getSize() {
        return size;
    }

    /**
     * Gets the item in the middle of the list
     *
     * @return
     */
    public E getMiddleValue() {
        if (size == 0) {
            return null; // list is empty
        }

        // create 2 nodes to act as pointers
        Node<E> slowPointer = head;
        Node<E> fastPointer = head;

        /*
         * fastPointer traverses the list twice as fast as slowPointer
         * when fastPointer reaches the end of the list, slowPointer should
         * be at the middle of the list
         */
        while (fastPointer.next != null) {
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
        }

        return slowPointer.element;
    }

}
