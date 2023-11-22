package new_package_4_hackerrank;

import java.util.TreeSet;

public class Missing_Number_In_Array {
    /*
    input : [1,2,4,5]
    3 missed, so it must be within range
    [1,2,3,4,5]
     */


    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,7,8}; //12345

        System.out.println(findMissedArray(arr));
    }

    static TreeSet<Integer> findMissedArray (int[] arr){

        TreeSet<Integer> treeSet = new TreeSet<>();
        int sum = 0 ;
        int sum1 = 0;

        int length = arr.length+1;

        for (int i = length; i > 0 ; i--){
            sum+=i;
        }


        for (int j = 0 ; j< arr.length; j++) {

            treeSet.add(arr[j]);
            sum1 += arr[j];
        }
        int missed = sum-sum1;

        treeSet.add(missed);


        return treeSet;
    }
}
