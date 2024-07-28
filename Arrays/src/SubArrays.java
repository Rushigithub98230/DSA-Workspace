import java.util.ArrayList;
import java.util.Collection;
import java.util.*;
public class SubArrays {

    public void printingSubArays(int[] arr){
        int totalsubarray=0;
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        ArrayList<Integer> sumOfSubArray= new ArrayList<Integer>();
        for(int start=0;start<arr.length;start++){
            for(int end=start; end<arr.length; end++){
                System.out.print("[ ");
                totalsubarray++;
                int sum=0;
                for( int subarr=start; subarr<=end; subarr++){
                    sum+=arr[subarr];
                    System.out.print(arr[subarr]);
                    if (subarr < end) {
                        System.out.print(", ");
                    }
                }
                sumOfSubArray.add(sum);
                System.out.print("] ");

                if (sum > maxSum) {
                    maxSum = sum;
                }
                if (sum < minSum) {
                    minSum = sum;
                }
            }
            System.out.println();

        }
        System.out.println("Total subarrays are: "+ totalsubarray);
        // Collections.sort(sumOfSubArray);
        System.out.println("Sum of subarrays: " + sumOfSubArray);


        System.out.println("Maximum sum of subarrays: " + maxSum);
        System.out.println("Minimum sum of subarrays: " + minSum);
    }
}
