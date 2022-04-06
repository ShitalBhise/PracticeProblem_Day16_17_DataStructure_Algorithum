package com.java;

import java.util.Scanner;

/*
//* @Purpose: BubbleSort Sort
   a. Desc -> Reads in Integer and prints them in sorted order using insertion sort.
   b. I/P -> read in the list words
   c. Logic -> Use Insertion Sort to sort the words in the Integer array
   d. O/P -> Print the Sorted List
//* @file : InsertionSort.java

*/

public class BubbleSort {
	static Scanner scanner = new Scanner(System.in);

    /*
     * @purpose: Ability to BubbleSort sort
     * @param: Takes integer array as input
     * @function : sorts the given array in ascending order and stores them in their
     * indecencies
     * @return: No return value.
     */
    static public void bubbleSort(Integer[] array) {
        for (int i = 1; i < array.length; i++) {
            int size = array.length;

            // loop to access each array element
            for (int j = 0; j < size - 1; j++)

                // loop to compare array elements
                for (int k = 0; k < size - j - 1; k++)

                    // compare two adjacent elements
                    // change > to < to sort in descending order
                    if (array[k].compareTo(array[k + 1]) > 0) {

                        // swapping occurs if elements
                        // are not in the intended order
                        Integer temp = array[k];
                        array[k] = array[k + 1];
                        array[k + 1] = temp;
                    }
        }
    }
}
