package Fibonacci;

public class Main {

    // Given a number N return the index value of the Fibonacci sequence, where the sequence is:

    // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144 ...
    // the pattern of the sequence is that each value is the sum of the 2 previous values,
    // that means that for N=5 → 2+3

    // For example: fibonacciRecursive(6) should return 8

    public static void main(String[] args) {

        int fibonacciIterative = fibonacciIterative(6);
        int fibonacciRecursive = fibonacciRecursive(6);

        System.out.println(fibonacciIterative);
        System.out.println(fibonacciRecursive);
    }

    // O(n)
    private static int fibonacciIterative(int n) {
        int[] arr = new int[n + 2]; // 1 extra to handle case, n = 0
        int i;

        /* 0th and 1st number of the series are 0 and 1*/
        arr[0] = 0;
        arr[1] = 1;

        for (i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        return arr[n];
    }

    // O(2^n)
    private static int fibonacciRecursive(int n) {
        if (n < 2) {
            return n;
        }

        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }
}
