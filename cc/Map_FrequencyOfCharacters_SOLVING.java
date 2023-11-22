package cc;

import java.util.LinkedHashMap;
import java.util.Map;

public class Map_FrequencyOfCharacters_SOLVING {

    public static void main(String[] args) {
        String str = "muhammed";

        System.out.println(frequentCharacter(str));

    }

    static Map<Character,Integer> frequentCharacter(String str){
        Map<Character,Integer> map = new LinkedHashMap<>();

        for(char each : str.toCharArray()){
            map.put(each, map.getOrDefault(each, 0)+1);
        }
        return map;
    }
}
