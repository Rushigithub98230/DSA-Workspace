import java.util.*;

public class BinarySearch {
 //array should be sorted for implementing binary search and finding key element
    public int binarySearch(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Check if the key is present at mid
            if (arr[mid] == key) {
                return mid;
            }

            // If key is greater, ignore left half
            if (arr[mid] < key) {
                start = mid + 1;
            }
            // If key is smaller, ignore right half
            else {
                end = mid - 1;
            }
        }

        // key is not present in array
        return -1;
    }


//    public static void main(String[] args) {
//        int[] numbers = {10, 20, 50000, 500000000, 50, 2, 4};
//
//        // Sort the array
//        Arrays.sort(numbers);
//
//        System.out.println("Sorted array: " + Arrays.toString(numbers));
//        BinarySearch BinarySearchObj=new BinarySearch();
//        int target = 4;
//        int result = BinarySearchObj.binarySearch(numbers, target);
//
//        if (result != -1) {
//            System.out.println("Element found at index: " + result);
//        } else {
//            System.out.println("Element not found");
//        }
//    }

}
