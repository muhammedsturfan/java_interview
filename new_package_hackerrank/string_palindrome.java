package new_package_hackerrank;

public class string_palindrome {


    public static void main(String[] args) {
        String str = "anna";
        System.out.println(strPalindrome(str));
    }

    static boolean strPalindrome (String str){
        String palindrome ="";

        for (int i = str.length()-1 ; i >= 0; i--) {
                    palindrome += str.charAt(i);
                    }
        if (str.equals(palindrome)){
            return true;

        }
        return false;
    }
}
