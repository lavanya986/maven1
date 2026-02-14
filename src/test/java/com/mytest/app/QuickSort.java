package com.mytest.app;

public class QuickSort {
    public static void sort(int[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);
            sort(array, low, pivotIndex - 1);  // Sort left half
            sort(array, pivotIndex + 1, high); // Sort right half
        }
    }

    private static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        return i + 1;
    }

    public static void main(String[] args) {
        int[] data = {8, 7, 2, 1, 0, 9, 6};
        sort(data, 0, data.length - 1);
        System.out.println("Sorted Array:");
        for (int i : data) System.out.print(i + " ");
    }
}
