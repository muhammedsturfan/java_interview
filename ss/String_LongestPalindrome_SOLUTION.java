package ss;

public class String_LongestPalindrome_SOLUTION {

    /*
    Find the longest palindrome

    Firstly, take first char and compare it with last char
     */


    public static void main(String[] args) {
        String str = "cabad";
        System.out.println(longestPalindrome(str));
    }

    static String longestPalindrome (String str) {
        char a;
        char b;
        String palindrome = "";

        for (int i = 0; i < str.length(); i++) {
            a = str.charAt(i);
        }
        for (int j = str.length() - 1; j >= 0; j--) {
            b = str.charAt(j);
        }

        return palindrome;
    }
}
