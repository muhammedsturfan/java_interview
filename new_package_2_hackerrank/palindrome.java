package new_package_2_hackerrank;

public class palindrome {

    /*
    Input
    1234321 -> Palindrome
    111 -> Palindrome
    152315 -> Not Palindrome
    954459 -> Palindrome
     */
    public static void main(String[] args) {
        int num = 1234321;
        System.out.println(palindrome(num));
    }

    static boolean palindrome(int num) {
        int reverted = 0;
        int original = num;
        if (num < 0) {
            return false;
        }

        while (num != 0) {
            int remainder = num % 10;

            reverted = reverted * 10 + remainder;

            num /= 10;
        }
        System.out.println("Reverted: " + reverted);

        return reverted==original;
    }
}