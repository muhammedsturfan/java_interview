package new_package_2_hackerrank;

import java.util.TreeSet;

public class two_string_anagram {

    //    //input
    //    str1 = "listen";
    //    str2 = "silent";
    //
    //    output
    //    true

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        System.out.println(anagramString(str1, str2));
    }

    static Boolean anagramString(String str1, String str2) {

        if (str1.length() == str2.length()) {

            String[] split1 = str1.split("");
            String[] split2 = str2.split("");
            TreeSet<String> ts1 = new TreeSet<>();
            TreeSet<String> ts2 = new TreeSet<>();


            for (String each : split1) {
                ts1.add(each);
            }
            for (String each1 : split2) {
                ts2.add(each1);
            }
            if (ts1.equals(ts2)) {
                return true;
            }
        }
        return false;

    }
}
