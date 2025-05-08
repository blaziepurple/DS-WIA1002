package q5;

/**
 * Circle class to create circle objects Implements Comparable<Circle> so it can
 * be compared with other circles
 */
public class Circle implements Comparable<Circle> {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    /**
     * Compares the radii of two circles
     *
     * @param otherCircle circle to be compared to
     * @return 1 if this radius > other radius 0 if this radius = other radius
     * -1 if this radius < other radius
     */
    public int compareTo(Circle otherCircle) {
        if (this.radius > otherCircle.radius) {
            return 1;
        } else if (this.radius == otherCircle.radius) {
            return 0;
        } else {
            return -1;
        }
    }

    public String toString() {
        return "Circle with radius: " + radius;
    }

}
