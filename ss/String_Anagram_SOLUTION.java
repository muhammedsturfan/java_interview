package ss;

import java.util.Arrays;

public class String_Anagram_SOLUTION {


    /*
            Write a  function that check if a string is build out of the same letters as another string.
            Ex: same("abc", "cab"); -> true , Solution 1:
                same("abc", "abb"); -> false:
     */

    public static void main(String[] args) {
        String str = "abc";
        String str1 = "cab";
        System.out.println(anagram(str, str1));
    }

    static boolean anagram (String str,String str1){
        boolean result = false;
        char[] chr = str.toCharArray();
        char[] chr1 = str1.toCharArray();

        String a1 ="" ,a2 ="";

        Arrays.sort(chr);
        Arrays.sort(chr1);

        for (char each : chr) {
            a1 += each;
        }
        for (char each1 : chr1 ) {
            a2 += each1;
        }
                if (a1.equals(a2)){
                    return true;
                }
        return result;

    }
}