package array_tasks;

public class Array_FindMaximum_SOLVING {

    public static void main(String[] args) {
        int[] arr = {1,3,2,6,7,4};
        findMaximum(arr);
    }

    public static int findMaximum(int[] arr){
        int maxNumber = arr[0];

        for (int i = 1;i <arr.length;i++){
            if (arr[i] > maxNumber ){
                maxNumber = arr[i];
            }
        }
        System.out.println(maxNumber);

        return maxNumber;
    }
}
