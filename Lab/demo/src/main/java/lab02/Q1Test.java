package lab02;

public class Q1Test {

    public static void main(String[] args) {
        // strObj can only hold Strings
        MyGeneric<String> strObj = new MyGeneric<>("Blazie");
        // intObj can only hold Integers (int only)
        MyGeneric<Integer> intObj = new MyGeneric<>(22);

        /**
         * Displays the value assigned to strObj and intObj
         */
        System.out.println("strObJ: " + strObj.getE());
        System.out.println("intObj: " + intObj.getE());
    }
}
