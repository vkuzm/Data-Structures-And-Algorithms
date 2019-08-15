package QuickSort;

public class Main {
    public static void main(String[] args) {
        int[] array = {99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};

        QuickSort quickSort = new QuickSort();
        quickSort.sort(array, 0, array.length - 1);

        for (int number : array) {
            System.out.print(number + ", ");
        }
    }
}

// Time complexity
// Average: O(n log n),
// Worst: O(n^2) (pivot is smaller then others)

// Space complexity
// O(long n)
class QuickSort {
    /* This function takes last element as pivot,
       places the pivot element at its correct
       position in sorted array, and places all
       smaller (smaller than pivot) to left of
       pivot and all greater elements to right
       of pivot */
    private static int quickSort(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1); // index of smaller element
        for (int j = low; j < high; j++) {
            // If current element is smaller than or equal to pivot
            if (arr[j] <= pivot) {
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }


    // arr[] - Array to be sorted
    // low  - Starting index
    // high  - Ending index
    void sort(int[] arr, int low, int high) {
        if (low < high) {
            // pi is partitioning index, arr[pi] is now at right place
            int pi = quickSort(arr, low, high);

            // Recursively sort elements before partition and after partition
            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }
    }
}
