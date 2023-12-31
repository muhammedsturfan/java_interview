package new_package_4_hackerrank;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class string_frequency_with_spaces {

    //string: Wklv lv d vdpsoh vwulqj
    //output: w=2,k=1,l=1,v=1 l=1,v=1, v=1,d=1,p=1,s=1,o=1,h=1, v=1,w=1,u=1,l=1,q=1,j=1

    public static void main(String[] args) {
        String str = "Wklvw lv d vdpsoh vwulqj";
        System.out.println(stringFrequency(str));
    }

    static Map<Character,Integer> stringFrequency(String str){
        Map<Character,Integer> map = new LinkedHashMap<>();

        String[] split = str.toLowerCase().split(" ");


        for (String each : split) {

            for (int i = 0; i < each.length(); i++) {
                char each1 = each.charAt(i);
                map.put(each1, map.getOrDefault(each1, 0) + 1);

                }
                map.clear();
            }
        return map;
        }
    }