package Dynamic_Programming;
//this program aims in finding the sum of elements that is the minimum value
//the elements are in an array and are broken into a subarray and can only find the sum
//of adjacement elements so they must be next to each other in the array
public class MinSumSubArray {

    //this is the naive approach in finding the sum in a subarray
    //time complexity O(n^2)
    static int findMinSumSubArray(int[] array){
        if(array.length == 0)
            return 0;

        int minSum = Integer.MAX_VALUE;

        
        for(int i = 0; i < array.length; i++){
            int currentSum = 0;
            for(int j = i; j < array.length; j++){
                currentSum += array[j];
                minSum = Math.min(minSum, currentSum);
            }
        }
        return minSum;
    }

    public static void main(String[] args) {
        int[] array = {-7,3,4,-2,-3,1,-3};
        int result = findMinSumSubArray(array);
        System.out.print("Elements in array: ");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i]+ " ");
        }
        System.out.println("\nMinimum Sub-Array: " + result);
    }
}
