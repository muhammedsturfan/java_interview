package string_tasks;

import com.sun.jdi.Value;

import java.lang.invoke.VarHandle;
import java.time.temporal.ValueRange;
import java.util.Map;
import java.util.TreeMap;

public class String_FrequencyOfCharactersInSortedManner_SOLUTION {

    /*
         Return the frequency of each character in the given string in Sorted manner
        Ex:
        Input: DDDAACCCCCCB
        Output: A2B1C6D3
    */

    public static void main(String[] args) {
        String str = "DDDAACCCCCCB";
        System.out.println(frequencyOfCharInSort(str));
    }

    static String frequencyOfCharInSort(String str){
        TreeMap<String,Integer> map = new TreeMap<>();

        for (String each : str.split("")) {
            if (map.containsKey(each)) {
                map.put(each, map.get(each) + 1);
            }else map.put(each,1);
        }
        str = "";
        for (Map.Entry<String, Integer> map1 : map.entrySet()){
            str += map1.getKey() + map1.getValue();
        }
        return str;
    }
}