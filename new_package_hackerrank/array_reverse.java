package new_package_hackerrank;

public class array_reverse {

    // revArr({1, 2, 3, 4, 5}) -> {5, 4, 3, 2, 1}
    // revArr({1})             -> {1}
    // revArr({1, 2, 3})       -> {3, 2, 1}


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] reversed = reversed(arr);
        for (int each: reversed){
            System.out.print(each);
        }

    }

    static int[] reversed (int[] arr){
        // swap first number with last number
        // use arr.length /2

        for (int i = 0 ; i < arr.length/2 ; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length -1 - i];
            arr[arr.length -1 -i] = temp;
        }
        return arr;
    }
}
