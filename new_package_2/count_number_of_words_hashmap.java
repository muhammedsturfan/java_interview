package new_package_2;

import java.util.HashMap;
import java.util.Map;

public class count_number_of_words_hashmap {

    /*
        String = "Hello World Hello Mars";
        Output = Hello = 2
                 World = 1
                 Mars = 1
     */

    public static void main(String[] args) {
        String str = "Hello World Hello Mars";
        for (Map.Entry<String,Integer> forMap : countWords(str).entrySet()){
            System.out.println(forMap);
        }
    }

    static Map<String,Integer> countWords (String str){
        HashMap<String,Integer> map = new HashMap<>();
        String[] splitted = str.split(" ");

        for (String each : splitted){
            map.put(each, map.getOrDefault(each,0)+1);
        }
        return map;
    }
}