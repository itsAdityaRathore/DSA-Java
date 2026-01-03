package sorting;

public class SelectionSort {

    public void selectionSort(int[] arr){

        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int min_index=i;
            for (int j = i+1; j < n; j++) {
                if(arr[j]<arr[min_index]){
                    min_index=j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }

        System.out.println("After Selection Sort");

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }


    public static void main(String[] args) {

        int[] arr = {7, 12, 9, 11, 3};
        System.out.println("Before Selection Sort");
        for ( int num:arr){
            System.out.println(num+" ");
        }
        System.out.println();

        SelectionSort sort = new SelectionSort();
        sort.selectionSort(arr);
    }
}
