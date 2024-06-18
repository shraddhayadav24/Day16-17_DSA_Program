package com.dsa.program;

import java.util.Arrays;

public class BinarySearchWordList {
	public static int binarySearch(String[] words, String target) {
        int left = 0;
        int right = words.length - 1;

        while (left <= right) {
            int mid = (left + right)/ 2;
            int result = target.compareTo(words[mid]);

            // Check if target is present at mid
            if (result == 0) {
                return mid;
            }

            // If target is greater, ignore left half
            if (result > 0) {
                left = mid + 1;
            }
            // If target is smaller, ignore right half
            else {
                right = mid - 1;
            }
        }
        // Target is not present in array
        return -1;
    }

    public static void main(String[] args) {
        String[] words = {"banana", "apple", "orange", "kiwi", "peach", "grapes", "lichi"};

        // Sort the array
        Arrays.sort(words);
        System.out.println("Sorted array: " + Arrays.toString(words));

        String target = "orange";
        int result = binarySearch(words, target);

        // Print the result
        if (result != -1) {
            System.out.println("The word '" + target + "' is found at index: " + result);
        } else {
            System.out.println("The word '" + target + "' is not found in the list.");
        }
    }
}
