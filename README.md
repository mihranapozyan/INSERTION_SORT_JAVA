# InsertionSort Class in Java

This repository contains an implementation of the **Insertion Sort** algorithm in Java. The `InsertionSort` class can be used to sort arrays of any data type that implements the `Comparable` interface, such as `Integer`, `Double`, `String`, or custom types with comparison logic.

## Features

- **Generic implementation**: The `InsertionSort` class works with any data type that implements the `Comparable<T>` interface.
- **Sorting algorithm**: Implements the **Insertion Sort** algorithm, a simple but effective algorithm for sorting small datasets.
- **Easy-to-use interface**: The sorting and printing logic is encapsulated in methods that make it simple to use for sorting arrays.

## How It Works

The `InsertionSort` class provides two main methods:
1. `sort(T[] array)`: Sorts the input array in place using the **Insertion Sort** algorithm.
2. `printArray(T[] array)`: Prints the elements of the array to the console.

The Insertion Sort algorithm works by iterating through the array, starting from the second element. For each element, it compares it to the elements before it and inserts it into its correct position, shifting the other elements as needed. This process continues until the array is fully sorted.

### Example

Here’s an example of how to use the `InsertionSort` class in Java:

```java
import org.insertion_sort.InsertionSort;

public class Main {
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
