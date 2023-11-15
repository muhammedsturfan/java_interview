package new_package_3;

public class Array_Triples {

        /*
    Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the array. Return true if the array does not contain any triples.


        Input:
        int[] arr = {1, 1, 2, 2, 1, 1, 2};
        System.out.println(noTriples(arr));
        Output:
        true

        Input:
        int[] arr = {1, 1, 1, 2, 2, 2};
        System.out.println(noTriples(arr));
        Output:
        false
     */

    public static void main(String[] args) {
        int[] arr = {1,2,1,2,3,2,2,2};
        System.out.println(tripleArray(arr));
    }

    static boolean tripleArray (int[] arr){

        for (int i = 0 ; i < arr.length-1;i++) {
            int count = 0;
            for (int j = i+1; j < arr.length - 1; j++) {

                if (arr[i] == arr[j]) {
                    count++;
                    if (count == 2) {
                        return true;
                    }
                }
                if (arr[i] != arr[j]) {
                    count = 0;
                }
            }
        }
        return false;
    }
}
