package q3;

/**
 * Modified StorePair to StorePairGeneric T represents Type T extends
 * Comparable<T> to implement the Comparable interface The class implements
 * Comparable<StorePairGeneric<T>> so it can compare to another instance of this
 * class
 */
public class StorePairGeneric<T extends Comparable<T>> implements Comparable<StorePairGeneric<T>> {

    private T first, second;

    /**
     * Initializes a pair
     *
     * @param first the value to be the first item in the pair
     * @param second the value to be the second item in the pair
     */
    public StorePairGeneric(T first, T second) {
        this.first = first;
        this.second = second;
    }

    /**
     * Returns the value of the first item in the pair
     *
     * @return the value of first
     */
    public T getFirst() {
        return first;
    }

    /**
     * Returns the value of the second item in the pair
     *
     * @return the value of second
     */
    public T getSecond() {
        return second;
    }

    public void setPair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return "first = " + first + " second = " + second;
    }

    @Override
    /**
     * Checks if the first values of two pairs are equal or not
     *
     * @param obj the pair to be compared to
     * @return true if the value of first for both the pair and the compared
     * pair are the same, false otherwise.
     */
    public boolean equals(Object otherPair) {
        return this.first.equals(((StorePairGeneric<T>) otherPair).getFirst());
        // casted the type of the parameter to StorePairGeneric to enable the comparison
    }

    /**
     * Compares the values of first of two pairs and returns an appropriate
     * value
     *
     * @param otherPair the pair to be compared to
     * @return 1 if this.first > otherPair.first 0 if this.first =
     * otherPair.first -1 if this.first < otherPair.first
     */
    @Override
    public int compareTo(StorePairGeneric<T> otherPair) {
        return this.first.compareTo(otherPair.first);
    }

}
