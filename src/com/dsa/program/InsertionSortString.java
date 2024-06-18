package com.dsa.program;

public class InsertionSortString {
	 public static void insertionSort(String[] arr) {
	        int n = arr.length;
	        for (int i = 1; i < n; ++i) {
	            String key = arr[i];
	            int j = i - 1;

	            while (j >= 0 && arr[j].compareTo(key) > 0) {
	                arr[j + 1] = arr[j];
	                j = j - 1;
	            }
	            arr[j + 1] = key;
	        }
	    }

	    public static void main(String[] args) {
	        String[] words = {"banana", "apple", "orange", "kiwi", "grapes"};
	        insertionSort(words);

	        // Print the sorted array
	        System.out.println("Sorted list of words:");
	        for (String word : words) {
	            System.out.print(word+" ");
	        }
	    }
}
