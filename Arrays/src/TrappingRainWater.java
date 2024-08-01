public class TrappingRainWater {

    // Function to print the left maximum heights
    public void printLeftMaxHeights(int[] leftMaxHeights) {
        System.out.println("Left Max Heights: ");
        for (int i = 0; i < leftMaxHeights.length; i++) {
            System.out.print(leftMaxHeights[i] + ",");
        }
        System.out.println();
    }

    // Function to print the right maximum heights
    public void printRightMaxHeights(int[] rightMaxHeights) {
        System.out.println("Right Max Heights: ");
        for (int i = 0; i < rightMaxHeights.length; i++) {
            System.out.print(rightMaxHeights[i] + ",");
        }
        System.out.println();
    }

    // Function to calculate the total trapped rainwater
    public int calculateTrappedRainWater(int[] heightsOfBlocks, int widthOfBlocks) {
        int n = heightsOfBlocks.length;
        if (n == 0) return 0;

        // Arrays to store the maximum heights to the left and right of each block
        int[] leftMaxHeights = new int[n];
        int[] rightMaxHeights = new int[n];
        int totalTrappedWater = 0;

        // Fill leftMaxHeights array
        leftMaxHeights[0] = heightsOfBlocks[0];
        for (int i = 1; i < n; i++) {
            leftMaxHeights[i] = Math.max(leftMaxHeights[i - 1], heightsOfBlocks[i]);
        }

        // Fill rightMaxHeights array
        rightMaxHeights[n - 1] = heightsOfBlocks[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMaxHeights[i] = Math.max(rightMaxHeights[i + 1], heightsOfBlocks[i]);
        }

        // Calculate the total trapped water
        for (int i = 0; i < n; i++) {
            int trappedRainwaterAtPosition=0;
            trappedRainwaterAtPosition+= (Math.min(leftMaxHeights[i], rightMaxHeights[i]) - heightsOfBlocks[i]) * widthOfBlocks;

            totalTrappedWater+=trappedRainwaterAtPosition;
        }


        printLeftMaxHeights(leftMaxHeights);
        printRightMaxHeights(rightMaxHeights);

        return totalTrappedWater;
    }


//    public static void main(String[] args) {
//        TrappingRainWater solution = new TrappingRainWater();
//        int[] heightsOfBlocks = {1, 2, 0, 1, 5};
//        int widthOfBlocks = 1;
//        int trappedWater = solution.calculateTrappedRainWater(heightsOfBlocks, widthOfBlocks);
//        System.out.println("Total Trapped Water: " + trappedWater);
//    }
}

/*
This solution has a time complexity of O(n) and a space complexity of O(n), where n is the length of the input array. */


