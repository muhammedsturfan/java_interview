package new_package_hackerrank;

import java.util.Arrays;

public class sum_of_two2 {

    // sum({1, 2, 3, 5}, 4)     -> {1, 3}
    // sum({7, 7, 4, 3, 8}, 7)  -> {4, 3}
    // sum({13, 43, 2, 71}, 84) -> {13, 71}

    public static void main(String[] args) {
        int[] arr={1,2,3,5};
        int count=4;
        int[] result = sumOfTwo(arr,count);
        System.out.println(Arrays.toString(result));


    }

    static int[] sumOfTwo (int[] arr,int count){
        for(int i=0; i < arr.length; i++){ //1 //2
            for(int n=i+1; n< arr.length; n++ ){ //2 3 5 // 3 5
                if(arr[i] + arr[n] ==count){
                    return new int[] {arr[i],arr[n]};
                }
            }
        }
        return null;
    }

}