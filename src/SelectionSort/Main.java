package SelectionSort;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 22, 2, 44, 23, 88, 256, 80, 1, 5, 6, 80};

        int[] sortedNumbers = selectionSort(numbers);
        for (int number : sortedNumbers) {
            System.out.println(number);
        }
    }

    // O(n^2) - Time complexity
    // O(1) - Space complexity
    private static int[] selectionSort(int[] array) {
        int length = array.length - 1;

        for (int i = 0; i < length; i++) {
            int min = i;

            for (int j = i + 1; j < length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }

            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }

        return array;
    }
}
