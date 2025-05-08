package q4;

public class Q4 {

    public static void main(String[] args) {
        Integer[] intArray = {5, 3, 7, 1, 4, 9, 8, 2};
        String[] strArray = {"red", "blue", "orange", "tan"};

        // Output: Min = 1 Max = 9 
        System.out.println(Q4.<Integer>minmax(intArray));
        // Output: Min = blue Max = tan
        System.out.println(Q4.<String>minmax(strArray));
    }

    // Generic method to find the minimum and maximum item using Comparable interface
    public static <E extends Comparable<E>> String minmax(E[] list) {
        E min = list[0];
        E max = list[0];

        // Iterates through the list and compares the current item with max and min.
        // Updates values of max and min if necessary
        for (E item : list) {
            if (item.compareTo(min) < 0) {
                min = item;
            }

            if (item.compareTo(max) > 0) {
                max = item;
            }
        }

        return "\nMin = " + min + " Max = " + max;
    }
}
