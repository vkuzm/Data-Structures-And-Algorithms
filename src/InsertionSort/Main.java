package InsertionSort;

public class Main {

    public static void main(String[] args) {
        int[] array = {99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};

        int[] sortedNumbers = insertionSort(array);

        for (int number : sortedNumbers) {
            System.out.print(number + ", ");
        }
    }

    // O(n^2) - Time complexity
    // O(1) - Space complexity
    // This algorithm is useful for sorting a small number of items.
    // It becomes inefficient when sorting input sequences having more than 100 items.
    private static int[] insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }

            array[j + 1] = key;
        }

        return array;
    }

}
