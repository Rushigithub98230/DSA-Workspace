public class PairsOfArray {

       public void printPairOfArray(int[] arr)
       {
           int totalNoPair=0;

            for(int i=0;i< arr.length; i++)
            {

              for(int j=i+1; j< arr.length; j++)
              {

                  System.out.print("(" + arr[i] + "," + arr[j] + ") ");
                  totalNoPair++;
              }
              System.out.println();
            }

           System.out.println("Total no of pairs: "+totalNoPair);
      }
}


