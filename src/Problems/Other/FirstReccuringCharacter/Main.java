package Problems.Other.FirstReccuringCharacter;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        // [2,5,1,2,3,5,1,2,4] // return 2
        // [2,1,1,2,3,5,1,2,4] // return 1
        // [3,4,5,6] // return null

        int[] array1 = {2, 5, 1, 2, 3, 5, 1, 2, 4};
        int[] array2 = {2, 1, 1, 2, 3, 5, 1, 2, 4};
        int[] array3 = {2, 3, 4, 5};

        System.out.println(findFirstReccuringChar3(array1));
        System.out.println(findFirstReccuringChar3(array2));
        System.out.println(findFirstReccuringChar3(array3));
    }


    // O(n) - Time complexity
    // O(n) - Time space
    private static int findFirstReccuringChar(int[] array) {
        Set<Integer> set = new HashSet<>();

        for (int element : array) {
            boolean isAdded = set.add(element);

            if (!isAdded) {
                return element;
            }
        }

        return -1;
    }

    // O(n^2) - Time complexity
    // O(n^2) - Time space
    private static int findFirstReccuringChar2(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int firstNumber = array[i];

            for (int j = i + 1; j < array.length; j++) {
                int secondNumber = array[j];

                if (firstNumber == secondNumber) {
                    return firstNumber;
                }
            }
        }

        return -1;
    }

    // O(n^2) - Time complexity
    // O(n^2) - Time space
    // Find near numbers
    private static int findFirstReccuringChar3(int[] array) {
        int range = 0;
        int num = -1;

        for (int i = 0; i < array.length; i++) {
            int firstNumber = array[i];

            for (int j = i + 1; j < array.length; j++) {
                int secondNumber = array[j];

                if (firstNumber == secondNumber) {
                    if (i <= range) {
                        num = firstNumber;
                    }

                    range = i;
                }
            }
        }

        return num;
    }

}
