package LeetCode_Package;

public class int_reverse {

    public static int reverse(int x) {
        int reversed = 0;
        while(x != 0){
            int lastDigit = x%10;
            x /= 10;

            reversed = reversed *10 + lastDigit;
        }
        return reversed;
    }

    public static void main(String[] args) {
        int x = 123;
        System.out.println(reverse(x));
    }
}
