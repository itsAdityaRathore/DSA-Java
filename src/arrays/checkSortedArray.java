package arrays;

public class checkSortedArray {


    public static void main(String[] args) {
//        int[] arr = new int[]{4, 3, 2, 1, 5, 9, 8, 7, 6};
        int[] arr = new int[]{1, 2, 3,3, 4, 5, 6};


        boolean isSorted = checkSortedOrNot(arr);

        System.out.println("Array is : " + isSorted);


    }

    private static boolean checkSortedOrNot(int[] arr) {

        for (int i = 1; i < arr.length; i++) {

            if (arr[i - 1] > arr[i]) {
                return false;
            }
        }

        return true;
    }
}
