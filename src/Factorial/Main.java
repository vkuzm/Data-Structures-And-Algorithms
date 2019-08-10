package Factorial;

public class Main {
    public static void main(String[] args) {
        int factorialIterative = findFactorialIterative(5);
        int factorialRecursive = findFactorialRecursive(5);

        System.out.println(factorialIterative);
        System.out.println(factorialRecursive);
    }

    // O(n)
    private static int findFactorialRecursive(int number) {
        if (number == 2) {
            return 2;
        }

        return number * findFactorialRecursive(number - 1);
    }

    // O(n)
    private static int findFactorialIterative(int number) {
        int factorial = 1;

        if (number == 2) {
            return 2;
        }

        for (int i = 2; i <= number; i++) {
            factorial *= i;
        }

        return factorial;
    }
}
