package new_package_3;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class remove_duplicates_from_string {
    /*
    INPUT
    helloworld

    OUTPUT
    helowrd
     */

    public static void main(String[] args) {
        String str = "helloworld";

        System.out.println(removeDuplicates(str));

    }
    static String removeDuplicates(String str){
        char[] arr = str.toCharArray();

        Set<Character> set = new LinkedHashSet<>();

        for (char arr1 : arr) {
            set.add(arr1);
        }
        return set.toString();
    }
}