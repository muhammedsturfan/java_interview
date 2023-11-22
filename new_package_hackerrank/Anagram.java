package new_package_hackerrank;

import java.util.Arrays;

public class Anagram {

    // isAnagram("listen", "silent")     -> true
    // isAnagram("triangle", "integral") -> true
    // isAnagram("abc", "bca")           -> true
    // isAnagram("abc", "ccb")           -> false
    // isAnagram("aaa", "aaab")          -> false

    public static void main(String[] args) {
        String str = "triangel";
        String str1 = "integral";

        System.out.println(isAnagram(str, str1));
    }

    static boolean isAnagram(String str, String str1) {

        // We have Sort feature of array.

        char[] arr = str.toCharArray();
        char[] arr1 = str1.toCharArray();

        Arrays.sort(arr);
        Arrays.sort(arr1);

        return Arrays.equals(arr,arr1);
    }
}
