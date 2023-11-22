package new_package_hackerrank;

public class second_max_in_array {

    public static void main(String[] args) {
        int[] arr = {1,6,3,8,5,0,4};
        System.out.println(secondMaxArray(arr));
    }
    
    static int secondMaxArray(int[] arr){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        
        for (int each: arr){
            if (max < each){
                secondMax = max;
                max = each;
            } else if (max > secondMax && secondMax < each) {
                secondMax = each;
            }
        }
        return secondMax;
    }
}
