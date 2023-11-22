package new_package_3_hackerrank;

public class Array_SecondLargestNumber {

    // int[] = {1,2,3,4}
    // 3
    // find largest numbers in order.

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(secondLargestNumber(arr));

    }


    static int secondLargestNumber(int[] arr) {

        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;


        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > firstMax) {
                secondMax = firstMax; // When firstMax is updated, secondMax should hold the old value of firstMax
                firstMax = arr[i];
            } else if (arr[i] > secondMax && arr[i] != firstMax) { // additional check to ensure that secondMax is not the same as firstMax
                secondMax = arr[i];
            }
        }

        return secondMax;
    }
}