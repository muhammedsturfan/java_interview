package new_package_3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class array_find_duplicate {

    //input: Array: [7, 10, 12, 7, 9, 12, 7]
    //output: Duplicates: [7, 12]


    public static void main(String[] args) {
        int[] arr = {7, 10, 12, 7, 9, 12, 7};
        System.out.println(findDuplicate(arr));
    }

    static ArrayList<Integer> findDuplicate(int[] arr) {
        ArrayList<Integer> newList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j] && !newList.contains(arr[i])){
                    newList.add(arr[i]);
                }
            }
        }
        return newList;
    }
}