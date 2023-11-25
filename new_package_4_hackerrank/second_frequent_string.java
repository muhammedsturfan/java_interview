package new_package_4_hackerrank;

import java.util.HashMap;
import java.util.Map;

public class second_frequent_string {

    //input
    // The dog jumps over the cat, the cat jumps over the dog, and the dog is quick.
    //output
    //dog


    public static void main(String[] args) {
        String str ="The dog jumps over the cat, the cat jumps over the dog , and the dog is quick.";

        System.out.println(secondFrequent(str));

    }

    static String secondFrequent(String str){
        String[] split = str.split(" ");

        Map<String, Integer> map = new HashMap<>();

        for (String each : split){
            map.put(each, map.getOrDefault(each,0)+1);
        }
        int maxValue = Integer.MIN_VALUE;
        String maxKey = "";
        int secondMaxValue = 0;
        String secondMaxKey = "";

        for (Map.Entry<String,Integer> newMap : map.entrySet()){
            int count = newMap.getValue();
            if (count > maxValue){
                secondMaxValue = maxValue;
                maxValue = count;
                maxKey = newMap.getKey();
            } else if (count > secondMaxValue && maxValue > count){
                secondMaxValue = count;
                secondMaxKey = newMap.getKey();
            }
        }
        return secondMaxKey;
    }
}