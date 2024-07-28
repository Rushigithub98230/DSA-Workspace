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




}
