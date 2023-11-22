package at;

public class Array_SecondLargestNumber_SOLVING {

    // int[] = {1,2,3,4}
    // 3
    // find largest numbers in order.

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,8,7};
        secondLargestNumber(arr);


    }

    static int secondLargestNumber(int[] arr){
        int largest = 0;
        int secondLargest=0;

        for (int each : arr){
            if (largest < each){
                largest = each;
                for (int each1: arr){
                    if (each1 < largest && secondLargest < each1){
                        secondLargest = each1;

                    }
                }
            }
        }
        System.out.println(secondLargest);
        return secondLargest;
    }
}
