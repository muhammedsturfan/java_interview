package at;

public class Array_Reverse_SOLVING {

    // demonstrate each number use foreach loop,

    // when arr[i] another array[x] must be reversed. x ==> arr.length-1 - i


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int[] reversed= reverseString(arr);
        for (int each : reversed){
            System.out.println(each);
        }
    }

    static int[] reverseString (int[] arr){
        int[] newArray = new int[arr.length];

        for (int i = 0 ; i < arr.length; i++){
            newArray[arr.length -1 - i]=arr[i];
        }


        return newArray;
    }
}