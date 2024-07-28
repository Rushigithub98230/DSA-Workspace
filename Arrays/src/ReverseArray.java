public class ReverseArray {


    public  int[] reverseArray(int [] arr){
        int start=0;
        int end = arr.length-1;

        while(start<end){

            arr[start]=arr[start]+arr[end];
            arr[end]= arr[start] - arr[end];
            arr[start]=arr[start]-arr[end];
            start++;
            end--;
        }

        return arr;
    }
}
