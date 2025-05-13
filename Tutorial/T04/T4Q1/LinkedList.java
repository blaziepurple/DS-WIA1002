package tutorial04;

public class LinkedList<E> {

    Node<E> head;
    Node<E> tail;
    int size = 0;

    public void addFirst(E e) {
        // Question 1(e) 
        // i- If the list contains any nodes. 
        // ii- If there are no nodes, then the tail is the same as the head.

        // Question 1(f)
        // create new node
        // set head of the list to this new node
        // update the list
        // if tail = null:
        //     tail = head
        // Question 1(g)
        Node<E> newNode = new Node<>(e);
        newNode.next = head;
        head = newNode;
        size++;

        if (tail == null) {
            tail = head;
        }
    }

    public void addLast(E e) {
        // Question 1(e) 
        // i- If the list contains any nodes. 
        // ii- If there are no nodes, then the head is the same as the tail.
        //
        // Question 1(f)
        // create new node
        // if tail = null:
        //      head = tail = new node
        // else:
        //      set tail of the list to this new node
        //      update the list
        //
        // Question 1(g)
        Node<E> newNode = new Node<>(e);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = tail.next;
        }
        size++;
    }

    public void add(int index, E e) {
        // Question 1(e) 
        // i- If the list contains any nodes. 
        // ii- If the index is valid (index > 0 && index < size)
        //
        // Question 1(f)
        // create new node
        // if index < 0 or index > size:
        //      throw an excpetion
        // else:
        //      loop through the list
        //      Add the node at the specified index
        //      addFirst if index = 0, addLast if index = size
        //
        // Question 1(g)
        if (index == 0) {
            addFirst(e);
        } else if (index >= size) {
            addLast(e);
        } else {
            Node<E> current = head;
            for (int i = 1; i < index; i++) {
                current = current.next;
            }
            Node<E> temp = current.next;
            current.next = new Node<>(e);
            (current.next).next = temp;
            size++;
        }
    }

    public E removeFirst() {
        // Question 1(e) 
        // i- If the list contains any nodes. 
        // ii- If there are no nodes, then return null.
        //
        // Question 1(f)
        // if size of list = 0, return null
        // else:
        //      copy the head to a temp value
        //      set the new head
        //      reduce the size of the list
        //      if head = null:
        //          tail = null
        //      return the temp element
        // Question 1(g)
        if (size == 0) {
            return null;
        } else {
            Node<E> temp = head;
            head = head.next;
            size--;
            if (head == null) {
                tail = null;
            }
            return temp.element;
        }
    }

    public E removeLast() {
        // Question 1(e) 
        // i- If the list contains any nodes. 
        // ii- If there are no nodes, then return null.
        //
        // Question 1(f)
        // if size of list = 0, return null
        // else if size of list = 1, return the element and set the tail and head to null
        // else:
        //      go to the node before the tail
        //      copy tail to a temp value
        //      reset the next of tail to null
        //      reduce list size
        //      return the temp element
        //      
        // Question 1(g)
        if (size == 0) {
            return null;
        } else if (size == 1) {
            Node<E> temp = head;
            head = tail = null;
            size = 0;
            return temp.element;
        } else {
            Node<E> current = head;
            for (int i = 0; i < size - 2; i++) {
                current = current.next;
            }
            Node<E> temp = tail;
            tail = current;
            tail.next = null;
            size--;
            return temp.element;
        }
    }

    public E remove(int index) {
        // Question 1(e) 
        // i- If the list contains any nodes. 
        // ii- If index is valid (index > 0 && index < size).
        //
        // Question 1(f)
        // if index is invalid, return null
        // else if index = 0, removeFirst()
        // else if index = size - 1, removeLast()
        // else:
        //      Loop through the list
        //      Stop before the index to be deleted
        //      Copy the next element to a variable
        //      Update list
        //      Return element to be deleted
        // Question 1(g)
        if (index < 0 || index >= size) {
            return null;
        } else if (index == 0) {
            return removeFirst();
        } else if (index == size - 1) {
            return removeLast();
        } else {
            Node<E> previous = head;
            for (int i = 1; i < index; i++) {
                previous = previous.next;
            }
            Node<E> current = previous.next;
            previous.next = current.next;
            size--;
            return current.element;
        }
    }
}
