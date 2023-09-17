package new_package_2;

import java.util.HashMap;
import java.util.Map;

public class second_frequent_string {

    /*
            Input
            String: "apple apple apple mango banana banana"

            Output
            banana
     */

    public static void main(String[] args) {
        String str = "apple apple apple mango banana banana";

        System.out.println(secondRepeatedString(str));

    }

    static String secondRepeatedString (String str) {
        String[] split = str.split(" ");

        HashMap<String, Integer> map = new HashMap<>();

        for (String each : split) {
            map.put(each, map.getOrDefault(each, 0) + 1);
        }

        String firstRepeated = "";
        String secondRepeated = "";
        int count1 = 0;
        int count2 = 0;

        for (Map.Entry<String, Integer> eachMap : map.entrySet()) {
            if (eachMap.getValue() > count1) {
                count1 = eachMap.getValue();
                firstRepeated = eachMap.getKey();
            }
        }
        for (Map.Entry<String, Integer> eachMap2 : map.entrySet()) {
            if (count2 < count1 && !eachMap2.getKey().equals(firstRepeated)) {
                if (eachMap2.getValue() > count2) {
                    count2 = eachMap2.getValue();
                    secondRepeated = eachMap2.getKey();
                }
            }
        }
            return secondRepeated;
        }
    }