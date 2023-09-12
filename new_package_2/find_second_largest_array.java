package new_package_2;

import java.lang.reflect.Array;

public class find_second_largest_array {

    public static void main(String[] args) {
        int[] arr = {1,7,3,6,9,3};
        System.out.println(SecondLargest(arr));
    }

    static int SecondLargest (int[] arr){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int each : arr){
            if (each > max){
                secondMax = max;
                max = each;
            } else if (each > secondMax && each != max) {
                secondMax = each;
            }
        }
        return secondMax;
    }
}
