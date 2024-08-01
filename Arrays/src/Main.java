import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        int[] numbers={1,2,0,1,5};
//        MaxSubArray maxSubArray=new MaxSubArray();
//
//        maxSubArray.findMaxSubArray(numbers);
//        maxSubArray.findMaxSubArrayUsingPrefixSum(numbers);
//        maxSubArray.findMaxSubArrayUsingKadaneAlgo(numbers);


        TrappingRainWater tp=new TrappingRainWater();

       int trapedWater= tp.calculateTrappedRainWater(numbers,1);
       System.out.print("Trapped Water:"+trapedWater);
    }
}