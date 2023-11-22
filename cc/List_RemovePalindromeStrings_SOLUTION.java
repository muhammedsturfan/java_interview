package cc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class List_RemovePalindromeStrings_SOLUTION {

    /*
    Input:
    List of Strings: ["radar", "apple", "madam", "pear", "level"]

    Output:
    List of Strings: ["apple", "pear"]
     */

    public static void main(String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList("radar", "apple", "madam", "pear", "level"));
        List<String> each = removePalindrome(words);
        System.out.println(each);
    }

    public static List<String> removePalindrome(List<String> list){
        Iterator<String> it = list.iterator();

        while (it.hasNext()){
            String str = it.next();
            String reversed = "";
            for (int i = str.length()-1 ; i >= 0; i--){
                reversed += str.charAt(i);
            }
            if (str.equalsIgnoreCase(reversed)){
                it.remove();
            }

        }
        return list;
    }
}
