package FindAppropriateSumOfPairOfNumber;

public class Main {

    public static void main(String[] args) {
        // [1,2,3,9] Sum = 8 / False
        // [1,2,4,4] Sum = 8 / True

        // Sorted, positive or negative

        int[] array = {1, 2, 4, 4};
        int sum = 8;

        // Naive solution
        // Bad O(n^2)
        System.out.println(naiveSolution(array, sum));

        // Better solution (because it's sorted)
        // Good O(n)
        System.out.println(betterSolution(array, sum));

        // Best solution (because it's sorted)
        // Good O(n)
        System.out.println(hasPairWithSum(array, sum));

    }

    private static String naiveSolution(int[] array, int sum) {
        for (int i = 0; i < array.length; i++) {

            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == sum) {
                    return "Bad: Sum of " + array[i] + " + " + array[j] + " is equal " + sum;
                }

            }
        }

        return "Matches not found";
    }

    private static String betterSolution(int[] array, int sum) {
        for (int i = 0; i < array.length; i++) {

            if (i + 1 < array.length) {

                int current = array[i];
                int next = array[i + 1];

                if (current + next == sum) {
                    return "Better: Sum of " + array[i] + " + " + array[i + 1] + " is equal " + sum;
                }
            }

        }

        return "Matches not found";
    }

    private static boolean hasPairWithSum(int[] array, int sum) {
        int low = 0;
        int height = array.length - 1;

        while (low < height) {
            int s = array[low] + array[height];

            if (s == sum) {
                return true;
            }
        }

        return false;
    }
}
