package new_package;

import java.util.Arrays;

public class Sort_Array {


    //We can solve that problem in 2 ways, with Bubble sort and Selected sort methods.

    public static void main(String[] args) {
        int[] arr = {1,6,3,7,3,0};
        Arrays.toString(arr);
        sSorted(arr);
        System.out.println(Arrays.toString(arr)); // In sort.

    }

    /*
     * Selection Sort
     * The main idea to keep finding the smallest element and put it the beginning of array.
     */
    static void sSorted (int[] arr){

        for (int i = 0; i <arr.length; i++){
            int minNum = i;

            for (int j = i+1 ; j < arr.length; j++){
                if (arr[minNum] > arr[j]){
                    minNum = j;
                }
            }
            //swap numbers
            int temp =arr[minNum];
            arr[minNum] = arr[i];
            arr[i] = temp;
        }

    }

    /*
     * Bubble Sort
     * In bubble sort we push the biggest elements to the end of array by switching pairs of elements
     * if they are not in correct order.
     */
    static void bSorted(int[] arr){

    }
}
