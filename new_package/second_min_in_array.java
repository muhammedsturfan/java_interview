package new_package;

public class second_min_in_array {

    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,7,40};
        System.out.println(secondMin(arr));
    }

    static int secondMin (int[] arr){
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int each : arr){
            if (each < min){
                secondMin = min;
                min = each;
            } else if(min < secondMin && secondMin > each){
                secondMin = each;
            }
        }
        return secondMin;
    }
}
