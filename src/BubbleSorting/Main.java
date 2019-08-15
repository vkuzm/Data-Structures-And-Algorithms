package BubbleSorting;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 22, 2, 44, 23, 88, 256, 80, 1, 5, 6, 80};

        int[] sortedNumbers = bubbleSort(numbers);
        for (int number : sortedNumbers) {
            System.out.println(number);
        }
    }

    // O(n^2) - Time complexity
    // O(1) - Space complexity
    private static int[] bubbleSort(int[] numbers) {
        int length = numbers.length - 1;

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        return numbers;
    }

}
