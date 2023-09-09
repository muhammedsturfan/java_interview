package new_package;

import java.util.Arrays;

public class sum_of_two {

    // sum({1, 2, 3, 5}, 4)     -> {1, 3}
    // sum({7, 7, 4, 3, 8}, 7)  -> {4, 3}
    // sum({13, 43, 2, 71}, 84) -> {13, 71}

    public static void main(String[] args) {
        int[] arr = {1,2,3,5};
        int num = 4;
        int [] result = sumOfTwo(arr,num);
        System.out.println(Arrays.toString(result));

    }

    static int[] sumOfTwo(int[] arr, int num){

        for (int i = 0 ; i < arr.length; i++){
            for (int j = i+1; j < arr.length; j++){
                if (arr[i] + arr[j] == num){
                    return new int[] {arr[i], arr[j]};
                }
            }
        }
        return null;
    }
}