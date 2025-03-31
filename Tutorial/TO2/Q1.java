package tutorial02;

class Container<T> {

    private T t;

    public Container() {
    }

    public void add(T t) {
        this.t = t;
    }

    public T retreive() {
        return t;
    }
}

public class Q1 {

    public static void main(String[] args) {
        Container<Integer> number = new Container();
        Container<String> string = new Container();

        number.add(50);
        string.add("Java");
        System.out.println(number.retreive());
        System.out.println(string.retreive());

    }
}
