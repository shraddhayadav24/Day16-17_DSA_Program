package com.dsa.program;

public class BuubleSortInteger {
	public static void main(String[] args) {
        // Define an array of integers
        int[] numbers = {64, 34, 25, 12, 22, 11, 90};

        // Print the array before sorting
        System.out.println("Before Sorting:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        // Sort the array using bubble sort
        bubbleSort(numbers);

        // Print the array after sorting
        System.out.println("After Sorting:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

    // Method to perform bubble sort on an array of integers
    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                // If the element found is greater than the next element, swap them
                if (array[j] > array[j + 1]) {
                    // Swap array[j] and array[j + 1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
