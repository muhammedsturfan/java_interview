package at;

public class Array_FirstDuplicatedElement_SOLVING {

    public static void main(String[] args) {
        int[] arr = {1,2,3,7,8,3,4,8};
        firstDuplicatedArray(arr);
    }

    public static int firstDuplicatedArray(int[] arr){
        int firstDuplicate = 0;

        for (int each : arr) {
            int countDuplicate = 0;
            for (int each1 : arr){
                if (each==each1){
                    countDuplicate++;
                    firstDuplicate = each;
                }
                }
            if (countDuplicate > 1){
                break;
            }
        }
        System.out.println(firstDuplicate);
        return firstDuplicate;
    }
}