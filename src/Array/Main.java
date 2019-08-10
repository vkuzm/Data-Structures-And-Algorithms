package Array;

public class Main {
    public static void main(String[] args) {

        Array array = new Array(100);

        array.add("Mike");
        array.add("Max");

        System.out.println(array.size());

        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }

        array.remove(1);

        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }

    }
}
