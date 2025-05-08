package lab02;

// Generic class MyGeneric
public class MyGeneric<E> {

    private E e;

    // Empty constructor
    public MyGeneric() {
    }

    // Constructor that accepts one parameter
    public MyGeneric(E e) {
        this.e = e;
    }

    /**
     * Returns the value of e.
     *
     * @return value of e
     */
    public E getE() {
        return e;
    }

    /**
     * Assigns/updates the value of e
     *
     * @param e the object to be set to e
     */
    public void setE(E e) {
        this.e = e;
    }

}
