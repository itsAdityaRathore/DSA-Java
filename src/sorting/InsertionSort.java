package sorting;

public class InsertionSort {

    public static void main(String[] args) {

        int[] nums = {13, 46, 24, 52, 20, 9};

        System.out.println("Before Using Insertion Sort: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();

        InsertionSort solution = new InsertionSort();
        // Function call for insertion sort
        nums = solution.insertionSort(nums);

        System.out.println("After Using Insertion Sort: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public int[] insertionSort(int[] arr) {

        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int currentValue = arr[i];
            int j = i - 1;
            while(j>=0 && arr[j] > currentValue){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = currentValue;
        }

        return arr;
    }
}
