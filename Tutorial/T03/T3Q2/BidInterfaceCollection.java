package tutorial03;

/**
 * An interface that adds a bid to a collection of bids
 */
public interface BidInterfaceCollection {

    /**
     * Adds a bid to the collection
     *
     * @param bid the bid to be added
     */
    void addBid(BidInterface bid);

    /**
     * Gets the bid in the collection with the best yearly cost
     *
     * @return the bid with the best yearly cost
     */
    double bestYearlyCost();

    /**
     * Gets the bid in the collection with the best initial cost
     *
     * @return the bid with the best initial cost
     */
    double bestInitialCost();

    /**
     * Clears the items in the collection
     */
    void clear();

    /**
     * Gets the number of items in the collection
     *
     * @return the number of items in the collection
     */
    int collectionSize();

    /**
     * Tests to see if the collection is empty or not
     *
     * @return true if empty, false if not
     */
    boolean isEmpty();
}
