package new_package_3;

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
        System.out.println(secondFrequent(str));

    }

    static String secondFrequent(String str) {

        String[] split = str.split(" ");

        HashMap<String, Integer> map = new HashMap<>();

        for (String each : split) {
            map.put(each, map.getOrDefault(each, 0) + 1);

        }
        int firstFrequent = Integer.MIN_VALUE;
        int secondFrequent = Integer.MIN_VALUE;
        String secondFrequentStr = "";
        String firstFrequentStr = "";

        for (Map.Entry<String, Integer> eachMap : map.entrySet()) {
            if (eachMap.getValue() > firstFrequent) {
                firstFrequent = eachMap.getValue();
                firstFrequentStr = eachMap.getKey();
            }
        }
        for (Map.Entry<String, Integer> eachMap1 : map.entrySet()) {
            if (eachMap1.getValue() > secondFrequent && firstFrequent > secondFrequent) {
                if (!eachMap1.getKey().contains(firstFrequentStr)) {
                    secondFrequent = eachMap1.getValue();
                    secondFrequentStr = eachMap1.getKey();
                }
            }

        }
        return secondFrequentStr;
    }
}