package Veeva_Interview_Package;

public class Sum_of_Absolute_Differences_in_a_sorted_Array {

    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int[] prefixSum = new int[n];
        int[] suffixSum = new int[n];

        // Calculate prefix sum
        prefixSum[0] = nums[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i];
        }

        // Calculate suffix sum
        suffixSum[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffixSum[i] = suffixSum[i + 1] + nums[i];
        }

        // Calculate result
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                result[i] = suffixSum[1] - (n - 1) * nums[i];
            } else if (i == n - 1) {
                result[i] = n * nums[i] - prefixSum[n - 2];
            } else {
                result[i] = (i + 1) * nums[i] - prefixSum[i - 1] + suffixSum[i + 1] - (n - i - 1) * nums[i];
            }
        }

        return result;
    }

}
