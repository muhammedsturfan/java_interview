package array_tasks;

import java.util.Arrays;

public class Array_MergeTwoArrays_SOLVING {

    public static void main(String[] args) {
        int[] arr1 = {1,2,4};
        int[] arr2 = {5,6,7};
        int [] mergedArray = concatArrays(arr1,arr2);
        System.out.println(Arrays.toString(mergedArray));
    }

    static int[] concatArrays(int[] arr1, int[] arr2){
        int[] mergedArray = new int[arr1.length+arr2.length];

        // Copy arrays, we have this feature in System (arrayCopy)

        System.arraycopy(arr1,0,mergedArray,0,arr1.length);
        System.arraycopy(arr2,0,mergedArray,arr1.length,arr2.length);


        return mergedArray;
    }
}
