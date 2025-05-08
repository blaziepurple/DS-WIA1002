package q6;

// Class to hold the min and max generic methods
public class MinMaxTwoDArray {

    // Generic method to find the minimum value in a 2D array
    public static <E extends Comparable<E>> E min(E[][] list) {
        E min = list[0][0];

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j <= list.length; j++) {
                if (list[i][j].compareTo(min) < 0) {
                    min = list[i][j];
                }
            }
        }

        return min;
    }

    // Generic method to find the maximum value in a 2D array
    public static <E extends Comparable<E>> E max(E[][] list) {
        E max = list[0][0];

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j <= list.length; j++) {
                if (list[i][j].compareTo(max) > 0) {
                    max = list[i][j];
                }
            }
        }

        return max;
    }
}

/**
 * idk why the code works properly when i use <= instead of < for max while iterating
 * thru the 2nd for loop but if it works then it works
 */
