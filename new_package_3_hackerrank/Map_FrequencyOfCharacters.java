package new_package_3_hackerrank;

import java.util.LinkedHashMap;
import java.util.Map;

public class Map_FrequencyOfCharacters {
    /*
    input : muhammed
    output : {m=3, u=1, h=1, a=1, e=1, d=1}
     */

    public static void main(String[] args) {
        String str = "muhammed";
        System.out.println(frequencyOfChars(str));
    }

    static Map<String,Integer> frequencyOfChars(String str){
        Map<String, Integer> map = new LinkedHashMap<>();

        String[] split = str.split("");

        for (String each : split){
            map.put(each, map.getOrDefault(each,0)+1);
        }

        return map;
    }
}
