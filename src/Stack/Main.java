package Stack;

public class Main {
    public static void main(String[] args) {

        Stack stack = new Stack();

        stack.push("Bear");
        stack.push("Fox");
        stack.push("Wolf");
        stack.push("Dog");
        stack.push("Cat");

        // PEEK TOP
        stack.peek();

        System.out.println("Peek top: ");
        System.out.println(stack.peek());

        // GET ALL VALUES
        System.out.println("\nValues: ");
        for (String value : stack.getValues()) {
            System.out.println(value);
        }

        // FIRST POP
        stack.pop();

        System.out.println("\nValues after first pop: ");
        for (String value : stack.getValues()) {
            System.out.println(value);
        }

        // SECOND POP
        stack.pop();

        System.out.println("\nValues after second pop: ");
        for (String value : stack.getValues()) {
            System.out.println(value);
        }
    }
}
