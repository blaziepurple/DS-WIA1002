package tutorial03;

/**
 * An interface to represent a bid for installing an air conditioning (AC) unit.
 *
 * @author BlaziePurple
 */
public interface BidInterface {

    /**
     * Gets the name of the company making the bid
     *
     * @return The name of the company making the bid
     */
    String returnCompanyName();

    /**
     * Gets the description of the AC unit
     *
     * @return The AC unit's description
     */
    String descriptionACUnit();

    /**
     * Gets the capacity of the AC unit in tons (1 ton = 12000 BTU)
     *
     * @return the capacity of the AC
     */
    int capacity();

    /**
     * Gets the AC unit's seasonal efficiency (SEER rating)
     *
     * @return the SEER rating of the AC
     */
    double seasonalEfficiency();

    /**
     * Gets the cost of the AC
     *
     * @return the cost of the AC
     */
    double cost();

    /**
     * Gets the cost of installing the AC unit
     *
     * @return the installation cost of the AC
     */
    double installationCost();

    /**
     * Gets the yearly cost of operating the AC
     *
     * @return the yearly operating cost of the AC
     */
    double yearlyOperatingCost();
}
