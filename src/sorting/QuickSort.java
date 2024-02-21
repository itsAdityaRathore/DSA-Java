package sorting;


import java.util.Arrays;

import static java.util.Collections.swap;

public class QuickSort {

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;

        while (i < j) {
            while (arr[i] <= pivot && i <= high - 1) {
                i++;
            }

            while (arr[j] > pivot && j >= low + 1) {
                j--;
            }

            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;

    }

    public static void sort(int[] arr, int low, int high) {
        //check if size is > 1
        if (low < high) {

            int pIndex = partition(arr, low, high);

            // left sub array
            sort(arr, low, pIndex - 1);

            // right sub array
            sort(arr, pIndex + 1, high);

        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4, 3, 2, 1, 5, 9, 8, 7, 6};

        sort(arr, 0, arr.length - 1);

        for(int i =0; i<arr.length-1;i++){
            System.out.println(arr[i]);
        }

    }

}
