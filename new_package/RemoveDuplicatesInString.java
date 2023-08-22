package new_package;

import java.util.HashMap;

public class RemoveDuplicatesInString {

    // removeDup("hello")  -> "helo"
    // removeDup("apple")  -> "aple"
    // removeDup("aaaaaa") -> "a"
    // removeDup("abc")    -> "abc"

    public static void main(String[] args) {
        String str = "opala";
        System.out.println(removeDuplicates(str));
    }

    static String removeDuplicates (String str){
        String noDuplicate = "";

        for (char ch : str.toCharArray()){
            if (!noDuplicate.contains(String.valueOf(ch))){
                noDuplicate += ch;
            }
        }
        return noDuplicate;
    }
}
