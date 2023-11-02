package new_package_3;

public class Array_LargestSumContiguousSubarray {

    /*
    Largest Sum Contiguous Subarray
    Write a program to find the sum of contiguous subarray within a one-dimensional array of numbers that has the largest sum.

        Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
        Output: 6
        Explanation: [4,-1,2,1] has the largest sum = 6.

     */

    public static void main(String[] args) {
        int[] arr = {4,-1,2,1};
        System.out.println(LargestSum(arr));

    }

    static int LargestSum(int[] arr) {
        int sum = Integer.MIN_VALUE;
        int count = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            count += arr[i] + arr[i + 1];
            if (sum < count) {
                sum = count;
            }
            if (sum > count) {
                arr[i]++;
            }
        }
        return sum;
    }
}
