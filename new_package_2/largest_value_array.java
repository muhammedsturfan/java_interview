package new_package_2;

public class largest_value_array {

    /*
    Input
    int[] arr = {1,2,5,6,7,4,8}
    Output
    8
     */

    public static void main(String[] args) {
        int[] arr={9,2,5,6,7,4,8};
        System.out.println(largestArray(arr));

    }
    static int largestArray (int[] arr){
        int maxNumber = Integer.MIN_VALUE;
        for (int each : arr){
            if (each > maxNumber){
                maxNumber = each;
            }
            }
        return maxNumber;
    }
}