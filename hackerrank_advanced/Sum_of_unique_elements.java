package hackerrank_advanced;

import java.util.HashMap;
import java.util.Map;

public class Sum_of_unique_elements {

    public static int sumOfUnique(int[] nums) {
        //need HashMap to keep track of the frequency of each number
        Map<Integer, Integer> count = new HashMap<>();
        for (int num : nums) {
            //find unique and give number 1 to find unique
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        int sum = 0;
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            // 1 meaning is this value is unique
            if (entry.getValue() == 1) {
                sum += entry.getKey();
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,2};
        System.out.println(sumOfUnique(nums));  // Output: 4
    }
}