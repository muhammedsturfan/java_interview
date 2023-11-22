package new_package_2_hackerrank;

public class triplet_in_array {

    /*
    Input : arr = {1, 2, 3, 4, 5}, sum = 9
    Output : 5, 3, 1

    Input : arr = {12, 3, 4, 1, 6, 9}, sum = 24;
    Output : 12, 3, 9
     */

    public static void main(String[] args) {
        int[] arr = {1, 6, 3, 4, 5};
        int target = 12;
        System.out.println(triplet(arr, target));
    }

    static boolean triplet(int[] arr, int target) {
        for (int i =0; i < arr.length-2;i++){
            for (int j = i+1 ; j<arr.length-1; j++){
                for (int k = i+2; k< arr.length; k++){
                    if (arr[i]+ arr[j]+ arr[k] ==target){
                        return true;
                    }
                }
            }
        }

        return false;
    }
}