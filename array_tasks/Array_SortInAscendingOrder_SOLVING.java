package array_tasks;

public class Array_SortInAscendingOrder_SOLVING {


    //[9,5,4,2,8] is num1 smaller than 1?
    public static void main(String[] args) {
        int[] arr = {9,5,4,2,8};
        sortInAscendingOrder(arr);
        for (int each : arr){
            System.out.println(each);
        }

    }

    static int sortInAscendingOrder(int[] arr) {
        int number = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    number = arr[i];
                    arr[i] = arr[j]; // we found here first arr[0] smaller number, that's guarantee.
                    arr[j] = number;
                }
            }

        }
        return number;
    }
    }