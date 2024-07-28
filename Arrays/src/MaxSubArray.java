
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
    }


    //time complexity of this code is O(n cube)
}

//public static void main(String[] args) {
//
//    int[] numbers={2,4,6,8,10};
//    MaxSubArray maxSubArray=new MaxSubArray();
//    maxSubArray.findMaxSubArray(numbers);
//}
