package com.bridgelabz;

public class InsertionSort {

    // /Function to sort array using insertion sort/
    void sort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }


    // Driver method
    public static void main(String args[]) {
        System.out.println("the elements before sorting are 12,6,11,12,13");
        int arr[] = {12, 11, 13, 5, 6};

        InsertionSort ob = new InsertionSort();
        System.out.println("the elements after sorting are");
        ob.sort(arr);

        printArray(arr);

    }
}
