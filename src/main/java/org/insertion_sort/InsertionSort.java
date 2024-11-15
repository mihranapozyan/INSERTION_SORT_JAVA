package org.insertion_sort;

public class InsertionSort<T extends Comparable<T>> {

    /**
     * Sorts an array using the insertion sort algorithm.
     * @param array The array to be sorted
     */
    public void sort(T[] array) {
        // Iterate over the array starting from the second element
        for (int i = 1; i < array.length; i++) {
            T key = array[i];  // The current element to be inserted
            int j = i - 1;

            // Move elements of the array that are greater than key
            // to one position ahead of their current position
            while (j >= 0 && array[j].compareTo(key) > 0) {
                array[j + 1] = array[j];
                j--;
            }

            // Insert the key into its correct position
            array[j + 1] = key;
        }
    }

    /**
     * Prints the elements of an array to the console.
     * @param array The array to be printed
     */
    public void printArray(T[] array) {
        // Print each element followed by a space
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println(); // Print a new line after the array
    }

    public static void main(String[] args) {
        // An array of integers to be sorted
        Integer[] intArray = {12, 11, 13, 5, 6};

        // Create an instance of the InsertionSort class
        InsertionSort<Integer> sorter = new InsertionSort<>();

        // Print the original array
        System.out.print("Original array: ");
        sorter.printArray(intArray);

        // Sort the array
        sorter.sort(intArray);

        // Print the sorted array
        System.out.print("Sorted array: ");
        sorter.printArray(intArray);
    }
}
