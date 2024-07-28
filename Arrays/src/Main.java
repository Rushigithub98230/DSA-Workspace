import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        int[] numbers={2,4,6,8,10};
        MaxSubArray maxSubArray=new MaxSubArray();
        maxSubArray.findMaxSubArray(numbers);
    }
}