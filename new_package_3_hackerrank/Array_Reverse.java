package new_package_3_hackerrank;

import java.util.Arrays;

public class Array_Reverse {

    public static void main(String[] args) {
        int[] arr = {1,4,5,6,7,8,3};

        int[] result = arrayReverse(arr);
        System.out.println(Arrays.toString(result));
    }

    static int[] arrayReverse (int[] arr){
        int[] array = new int[arr.length];
        int index = 0;
        int lastDigit = arr.length-1;

        while(index < arr.length){
            array[index] = arr[lastDigit];
            index++;
            lastDigit--;

        }
        return array;
    }
}
