package new_package_3;

import java.util.Set;
import java.util.TreeSet;

public class Array_SecondLargestNumber {

    // int[] = {1,2,3,4}
    // 3
    // find largest numbers in order.

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(secondLargestNumber(arr));

    }


    static int secondLargestNumber(int[] arr) {

        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;


        for (int i = 0; i < arr.length; i++) {

                if (arr[i] > firstMax) {
                firstMax = arr[i];
            }
                if (firstMax > arr[i]) {
                    if (arr[i] > secondMax) {
                        secondMax = arr[i];
                    }
                }
            }
        return secondMax;
    }
}