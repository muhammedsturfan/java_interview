package array_tasks;

import javax.swing.text.StyleContext;
import java.awt.*;

public class Array_LargestSumContiguousSubarray_SOLVING {

    /*
    Largest Sum Contiguous Subarray
    Write a program to find the sum of contiguous subarray within a one-dimensional array of numbers that has the largest sum.

    Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
    Output: 6
    Explanation: [4,-1,2,1] has the largest sum = 6.

 */

    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        largestSum(arr);
    }

    static int largestSum(int[] arr) {
        int maxSummary = 0, maxNumber = 0;

        for (int each : arr){
            maxNumber = each + maxNumber;
            maxNumber = Integer.max(maxNumber,each);
            maxSummary = Integer.max(maxNumber,each);
        }

        System.out.println(maxSummary);
        return maxSummary;
        }

    }