package q2;

public class CompareMax {

    public static void main(String[] args) {
        System.out.println(maximum(22, 4, 8));
    }

    // Generic method to handle any type of data
    public static <E extends Comparable<E>> E maximum(E e1, E e2, E e3) {

        // if e1 is the largest
        if (e1.compareTo(e2) > 0 && e1.compareTo(e3) > 0) {
            return e1;
        } else if (e2.compareTo(e1) > 0 && e2.compareTo(e3) > 0) { // if e2 is the largest
            return e2;
        } else {
            return e3; // if e3 is the largest
        }
    }
}
