package MergeSortedArrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // mergeSortedArrays([0,3,4,31], [4,6,30]);

        // Example: [0,3,4,4,6,30,31]

        // Input 2 arrays
        // Output 1 sorted array

        int[] array1 = {0, 3, 4, 31};
        int[] array2 = {4, 6, 30, 34};

        // O(n1 + n2) - Time complexity
        // O(n1 + n2) - Space complexity
        int[] sortedArray = mergeSortedArrays(array1, array2);

        for (int array : sortedArray) {
            System.out.println(array);
        }


/*        int[] s = mergeArrays(array1, array2);

        for (int array : s) {
            System.out.println(array);
        }*/
    }

    private static int[] mergeSortedArrays(int[] arr1, int[] arr2) {

        int n1 = arr1.length;
        int n2 = arr2.length;

        int i = 0;
        int j = 0;
        int k = 0;

        int[] margetArray = new int[n1 + n2];

        while (i < n1 && j < n2) {

            // Check if current element of first
            // array is smaller than current element
            // of second array. If yes, store first
            // array element and increment first array
            // index. Otherwise do same with second array
            if (arr1[i] < arr2[j]) {
                margetArray[k++] = arr1[i++];
            } else {
                margetArray[k++] = arr2[j++];
            }
        }

        // Store remaining elements of first array
        while (i < n1)
            margetArray[k++] = arr1[i++];

        // Store remaining elements of second array
        while (j < n2)
            margetArray[k++] = arr2[j++];

        return margetArray;
    }


    //  [0, 3, 4, 31]
    //  [4, 6, 30]


    // 0 < 4
    // [0]

    // 3 < 4
    // [0, 3]

    // 4 < 4
    // [0, 3, 4]

    // 4 < 6
    // [0, 3, 4, 4]

    // 31 < 6
    // [0, 3, 4, 4, 6]

    // 31 < 30
    // [0, 3, 4, 4, 6, 30]

    // 31
    // [0, 3, 4, 4, 6, 30, 31]


    public static int[] mergeArrays(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        System.arraycopy(a, 0, result, 0,  a.length);
        System.arraycopy(b, 0, result, a.length, b.length);
        Arrays.sort(result); // O(log n)
        return result;
    }

}
