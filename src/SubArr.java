import java.util.*;
//Given an array of integers, A of length N, find out the maximum sum sub-array of non negative numbers from A.
//
//The sub-array should be contiguous i.e., a sub-array created by choosing the second and fourth element and skipping the third element is invalid.
//
//Maximum sub-array is defined in terms of the sum of the elements in the sub-array.
//
//Find and return the required subarray.
//
//NOTE:
//
//If there is a tie, then compare with segment's length and return segment which has maximum length.
//If there is still a tie, then return the segment with minimum starting index.
// Example Explanation
//        Explanation 1:
//
//        The two sub-arrays are [1, 2, 5] [2, 3].
//        The answer is [1, 2, 5] as its sum is larger than [2, 3].

public class SubArr {
    public int[] maxset(int[] A) {
        ArrayList<Integer> maxArray = new ArrayList<Integer>();
        ArrayList<Integer> newArray = new ArrayList<Integer>();

        long sum = 0;
        long maxSum = 0;


        for(int i=0; i< A.length; i++){
            if (A[i] >= 0) {
                newArray.add(A[i]);
                sum += A[i];
            }else {
                sum = 0;
                newArray = new ArrayList<Integer>();
            }
            if((maxSum < sum) || ((maxSum == sum) && (newArray.size() > maxArray.size()))) {
                maxSum = sum;
                maxArray = newArray;
            }

        }
        int[] result = new int[maxArray.size()];
        for(int i = 0; i< maxArray.size(); i++){
            result[i] = maxArray.get(i);
        }

        return result;
    }
}
