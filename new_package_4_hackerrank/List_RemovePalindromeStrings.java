package new_package_4_hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List_RemovePalindromeStrings {

    /*
    Input:
    List of Strings: ["radar", "apple", "madam", "pear", "level"]

    Output:
    List of Strings: ["apple", "pear"]
     */


    public static void main(String[] args) {
        List<String> str = new ArrayList<>(Arrays.asList("radar", "apple", "madam", "pear", "level"));
        System.out.println(removePalindrome(str));

    }

    static List<String> removePalindrome(List<String> str){
        List<String> newList = new ArrayList<>();

        for (String each : str){
            String reversed = "";
            for (int i = each.length()-1; i >= 0 ;i--){
                reversed+= each.charAt(i);

            }
            if (!reversed.equals(each)){
                newList.add(each);
            }
        }
        return newList;
    }

}
