package tutorial02;

public class MyArray<E> {

    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5};
        String[] strings = {"Jane", "Tom", "Bob"};
        Character[] chars = {'a', 'b', 'c'};

        MyArray.listAll(numbers);
        MyArray.listAll(strings);
        MyArray.listAll(chars);
    }

    public static <E> void listAll(E[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
