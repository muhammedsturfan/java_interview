package array_tasks;

import java.util.HashSet;
import java.util.Set;

public class Array_RemoveDuplicates_SOLVING {


    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6,7,1,3,6,9,9};
            removeDuplicates(arr);
        }

    static void removeDuplicates(int[] arr){

        Set<Integer> hash = new HashSet<>();
        for (int each : arr){
            hash.add(each);
        }
        System.out.println(hash);


        }
}
