package Veeva_Interview_Package;

public class Single_Element_in_a_sorted_Array {

    //find high and low beacuse this is sorted.
    // we can solve this problem find average

    public int singleNonDuplicate(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (mid % 2 == 1) {
                mid--;  // Ensure the mid index is even
            }

            if (nums[mid] != nums[mid + 1]) {
                high = mid;  // The single element is on the left side
            } else {
                low = mid + 2;  // The single element is on the right side
            }
        }

        return nums[low];
    }

}
