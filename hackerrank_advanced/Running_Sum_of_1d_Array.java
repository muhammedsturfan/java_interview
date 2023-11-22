package hackerrank_advanced;

public class Running_Sum_of_1d_Array {

    public static void main(String[] args) {
        int[] nums = {3,1,2,10,1};
        int[] result = runningSum(nums);

        // Print the result
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
    public static int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }
}