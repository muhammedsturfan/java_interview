package new_package_2_hackerrank;

public class sum_of_two {

    /*
    Input:
    Array: [1, 2, 3, 4, 5]
    Target Sum: 9

    Output:
    true
    (Explanation: 4 + 5 = 9)
     */

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int target = 9;
        System.out.println(sumOfTwo(arr, target));
    }

    static boolean sumOfTwo (int arr[], int target){
        for (int i = 0 ; i < arr.length; i++){
            for (int j = i+1 ; j<arr.length; j++){
                if (arr[i] + arr[j] ==target){
                    return true;
                }
            }
        }
        return false;
    }
}
