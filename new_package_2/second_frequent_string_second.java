package new_package_2;

import java.util.HashMap;
import java.util.Map;

public class second_frequent_string_second {

        /*
            Input
            String: "Mars Moon Mars World Jupiter Moon Mars Mars Mars World Moon"

            Output
            Moon
     */


    public static void main(String[] args) {
        String str = "Mars Moon Mars World Jupiter Moon Mars Mars Mars World Moon";
        System.out.println(secondFrequentString(str));
    }

    static String secondFrequentString (String str){
        String[] split = str.split(" ");

        HashMap<String,Integer> hashMap = new HashMap<>();

        for (String each : split){
            hashMap.put(each,hashMap.getOrDefault(each,0)+1);
        }

        String firstRepeated ="";
        String secondRepeated = "";
        int first = 0;
        int second = 0;

        for (Map.Entry<String, Integer> mapEach : hashMap.entrySet()){
            if (mapEach.getValue() > first){
                first = mapEach.getValue();
                firstRepeated = mapEach.getKey();
            }
        }
        for (Map.Entry<String,Integer> mapEach2 : hashMap.entrySet()){
            if (first > second && !secondRepeated.equals(firstRepeated)){
                if (mapEach2.getValue() > second){
                    second = mapEach2.getValue();
                    secondRepeated = mapEach2.getKey();
                }
            }
        }
        return secondRepeated;
    }
}
