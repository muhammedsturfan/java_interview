package at;

public class Array_FindMinimum_SOLVING {

    public static void main(String[] args) {
        int[] arr = {1,3,4,56,6,-1};
        findMinimum(arr);
    }

    static int findMinimum(int[] arr){

        int min = arr[0];

        for (int i = 0; i < arr.length; i++){
            if (min >= arr[i]){
                min = arr[i];
            }
        }
        System.out.println(min);

        return min;
    }
}
