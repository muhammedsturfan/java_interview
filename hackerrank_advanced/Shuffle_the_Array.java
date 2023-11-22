package hackerrank_advanced;

public class Shuffle_the_Array {
    public static void shuffle(int[] nums, int n) {
        //int n repsesent half of the array (2n)

        for (int i = 0; i < n; i++) {
            int number = nums[i + n];
            for (int j = i + n; j > i + 1; j--) {
                nums[j] = nums[j - 1];
            }
            nums[i + 1] = number;
        }
    }

    public static void main(String[] args) {

        int[] nums = {2, 5, 1, 3, 4, 7};
        shuffle(nums, 3);
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
