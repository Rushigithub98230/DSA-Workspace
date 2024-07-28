
import java.util.*;

public class MaxSubArray {

    public void findMaxSubArray(int[] arr){
        int maxSum = Integer.MIN_VALUE;

        for(int start=0; start< arr.length; start++){
            for(int end = start; end < arr.length ; end++){
                int sum=0;
               for(int subarr=start; subarr<=end; subarr++){
                  sum+=arr[subarr];
               }
               if(sum>maxSum){
                 maxSum=sum;
               }
            }
        }

        System.out.println("Max sum of sub array is : "+ maxSum);
        //time complexity of this code is O(n cube)
    }





    //another approach of doing same using prefix sum technnique

    public void findMaxSubArrayUsingPrefixSum(int[] arr){
        int n = arr.length;
        int[] prefixSum = new int[n];

        // Compute prefix sum array
        prefixSum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i-1] + arr[i];
        }

        int maxSum = Integer.MIN_VALUE;

        // Iterate over all subarray start and end indices
        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end++) {
                // Calculate subarray sum using prefix sums
                int subArraySum = prefixSum[end] - (start > 0 ? prefixSum[start - 1] : 0);
                // Update maxSum if we found a new maximum
                if (subArraySum > maxSum) {
                    maxSum = subArraySum;
                }
            }
        }

        System.out.println("Max sum of subarray is: " + maxSum);
    }

    /* Time Complexity of above code:
         - Prefix Sum Array Computation: (O(n))
         - Finding Maximum Subarray Sum: (O(n^2))
         - Total Time Complexity: (O(n^2))

     Although this approach is not as efficient as Kadane's Algorithm (which runs in \(O(n)\)), it is more intuitive and easier to understand for those learning about subarray sum problems.*/




/*
Kadane's Algorithm is an efficient way to find the maximum sum of a subarray in a given array. The algorithm works in (O(n)) time complexity, making it highly efficient for large arrays.
*/

        public void findMaxSubArrayUsingKadaneAlgo(int[] arr) {
            int maxSum = Integer.MIN_VALUE;
            int currentSum = 0;

            for (int i = 0; i < arr.length; i++) {
                currentSum += arr[i];

                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }

                if (currentSum < 0) {
                    currentSum = 0;
                }
            }

            System.out.println("Max sum of subarray is: " + maxSum);
        }
/*

Consider the array `{1, -3, 2, 1, -1, 3, -2}`.

1. Initialization**:
   - `maxSum = Integer.MIN_VALUE`
   - `currentSum = 0`

2. Iterate Through the Array:

   - For each element in the array:
     - Add the current element to `currentSum`.
     - If `currentSum` is greater than `maxSum`, update `maxSum` to `currentSum`.
     - If `currentSum` is negative, reset `currentSum` to 0.

   - For `i = 0`, `arr[i] = 1`: `currentSum = 1`, `maxSum = 1`
   - For `i = 1`, `arr[i] = -3`: `currentSum = -2`, `maxSum = 1` (reset `currentSum` to 0)
   - For `i = 2`, `arr[i] = 2`: `currentSum = 2`, `maxSum = 2`
   - For `i = 3`, `arr[i] = 1`: `currentSum = 3`, `maxSum = 3`
   - For `i = 4`, `arr[i] = -1`: `currentSum = 2`, `maxSum = 3`
   - For `i = 5`, `arr[i] = 3`: `currentSum = 5`, `maxSum = 5`
   - For `i = 6`, `arr[i] = -2`: `currentSum = 3`, `maxSum = 5`

Result:
- The maximum sum of the subarray is `5`, which is obtained from the subarray `[2, 1, -1, 3]`.

Time Complexity:
- The time complexity of Kadane's Algorithm is (O(n)), where (n) is the length of the array, because it involves a single pass through the array.

 */


}


