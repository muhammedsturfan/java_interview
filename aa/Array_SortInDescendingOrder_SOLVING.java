package aa;

public class Array_SortInDescendingOrder_SOLVING {

    /*EXAMPLE

    input = [1,5,6,7,8,3]
    output = [8,7,6,5,3,1]

     */

    public static void main(String[] args) {
        int[] arr = {1,5,6,7,8};
        descendingOrder(arr);
        for (int each : arr){
            System.out.println(each);
        }
    }

    static int descendingOrder(int[] arr){
        int number = 0;

        for(int i =0; i < arr.length;i++){
            for (int j = i +1; j < arr.length; j++){
                if (arr[i] < arr[j]){
                    number = arr[i];
                    arr[i] = arr[j]; //arr[0] will be max number
                    arr[j] = number;
                }
            }
        }
        return number;
    }
}
