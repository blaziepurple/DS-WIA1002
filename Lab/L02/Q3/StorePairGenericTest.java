package q3;

// Test class for L2Q3
public class StorePairGenericTest {

    public static void main(String[] args) {
        StorePairGeneric<Integer> a = new StorePairGeneric<>(6, 4);
        StorePairGeneric<Integer> b = new StorePairGeneric<>(2, 2);
        StorePairGeneric<Integer> c = new StorePairGeneric<>(6, 3);

        System.out.println("Pair a: " + a.toString());
        System.out.println("Pair b: " + b.toString());
        System.out.println("Pair c: " + c.toString());

        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(b.equals(c));

        System.out.println(a.compareTo(b));
        System.out.println(a.compareTo(c));
        System.out.println(b.compareTo(c));
    }
}
