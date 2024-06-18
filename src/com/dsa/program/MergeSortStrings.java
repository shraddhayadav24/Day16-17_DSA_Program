package com.dsa.program;


	import java.util.ArrayList;
	import java.util.List;

	public class MergeSortStrings {

	    public static void main(String[] args) {
	        List<String> strings = new ArrayList<>();
	        strings.add("apple");
	        strings.add("orange");
	        strings.add("banana");
	        strings.add("grape");
	        strings.add("pear");

	        System.out.println("Original List: " + strings);
	        
	        mergeSort(strings);

	        System.out.println("Sorted List: " + strings);
	    }

	    public static void mergeSort(List<String> list) {
	        if (list.size() <= 1) {
	            return; // Base case: list is already sorted if size is 0 or 1
	        }

	        int mid = list.size() / 2;
	        List<String> left = new ArrayList<>(list.subList(0, mid)); // Sublist from index 0 to mid-1
	        List<String> right = new ArrayList<>(list.subList(mid, list.size())); // Sublist from mid to end

	        mergeSort(left); // Recursively sort the left sublist
	        mergeSort(right); // Recursively sort the right sublist

	        merge(list, left, right); // Merge the sorted sublists
	    }

	    public static void merge(List<String> result, List<String> left, List<String> right) {
	        int i = 0, j = 0, k = 0;

	        // Merge elements from left and right back into result in sorted order
	        while (i < left.size() && j < right.size()) {
	            if (left.get(i).compareTo(right.get(j)) < 0) {
	                result.set(k++, left.get(i++));
	            } else {
	                result.set(k++, right.get(j++));
	            }
	        }

	        // Copy remaining elements of left and right if any
	        while (i < left.size()) {
	            result.set(k++, left.get(i++));
	        }
	        while (j < right.size()) {
	            result.set(k++, right.get(j++));
	        }
	    }
	}


