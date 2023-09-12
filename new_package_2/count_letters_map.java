package new_package_2;

import java.util.HashMap;
import java.util.Map;

public class count_letters_map {

    /*
        input
        String = aabbccc
        output
        {a=2, b=2, c=3}
     */

    public static void main(String[] args) {
        String str = "aabbccc";
        for (Map.Entry<Character,Integer> newMap : countLetters(str).entrySet()){
            System.out.println(newMap);
        }
    }

    static HashMap<Character,Integer> countLetters(String str){
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++){
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i),0)+1);
        }
        return map;
    }
}
