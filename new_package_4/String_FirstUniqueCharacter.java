package new_package_4;

import java.util.Arrays;

public class String_FirstUniqueCharacter {

    /*
    input europaleague
    output r
     */

    public static void main(String[] args) {
        String str = "europaleague";
        System.out.println(firstUniqueCharacter(str));
    }

    static String firstUniqueCharacter (String str){
        String[] split = str.split("");

        for (int i = 0 ; i < str.length();i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (split[i].equals(split[j])) {
                    count++;
                }
            }
            if (count == 1) {
                return split[i];
            }
        }
        return "";
        }

    }