package sorting;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {

    /*
    TC = n log n
    SC = O(n) for using temp array
     */

    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 4, 1};
        MergeSort sol = new MergeSort();
        sol.mergeSort(arr, 0, arr.length - 1);
        for (int num : arr)
            System.out.print(num + " ");
        System.out.println();
    }

    public void mergeArray(int[] arr, int low, int mid, int high) {

        List<Integer> temp = new ArrayList<>();
        int left = low, right = mid + 1;

        // Merge both the sorted arrays
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left++]);
            } else {
                temp.add(arr[right++]);
            }
        }

        // add the remaining left elements
        while (left <= mid) {
            temp.add(arr[left++]);
        }
        // add the remaining right elements
        while (right <= high) {
            temp.add(arr[right++]);
        }

        // Copy back to original array
        for (int i = low; i <= high; i++)
            arr[i] = temp.get(i - low);

    }

    public void mergeSort(int[] arr, int low, int high) {
        if (low >= high) return;
        int mid = (low + high) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        mergeArray(arr, low, mid, high);
    }
}
