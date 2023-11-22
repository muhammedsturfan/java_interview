package new_package_2_hackerrank;

public class duplicate_element_array {

    /*
    Array: [1, 2, 3, 4, 2, 5, 6, 3]

    Output : 2 3
     */

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,2,5,6,3};
        duplicateArray(arr);
    }

    static void duplicateArray (int[] arr){

        for (int i = 0 ; i < arr.length; i++){
            for (int j = i+1; j< arr.length; j++){
                if (arr[i] == arr[j]){
                    System.out.print(arr[i]+ " ");
                }
            }
        }
    }

}