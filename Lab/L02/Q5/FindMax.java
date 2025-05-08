package q5;

public class FindMax {

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3};
        String[] strArray = {"red", "green", "blue"};
        Circle[] circleArray = {new Circle(3), new Circle(2.9), new Circle(5.9)};

        System.out.println("Max of intArray: " + FindMax.<Integer>max(intArray));
        System.out.println("Max of strArray: " + FindMax.<String>max(strArray));
        System.out.println("Max of circleArray: " + FindMax.<Circle>max(circleArray));
    }

    // Generic method to find the max value item in an array
    public static <E extends Comparable<E>> E max(E[] list) {
        E max = list[0];

        for (E element : list) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }

        return max;
    }
}
