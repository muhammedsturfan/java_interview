package new_package_hackerrank;

import java.util.LinkedHashMap;
import java.util.Map;

public class Count_Letters_Map {

    // countLetters("hello")    -> {h=1, e=1, l=2, o=1}
    // countLetters("aauuchhh") -> {a=2, u=2, c=1, h=3}
    // countLetters("aaaaaa")   -> {a=6}
    // countLetters("abc")      -> {a=1, b=1, c=1}


    public static void main(String[] args) {
        String str = "opala";
        System.out.println(countLetters(str));
    }

    static Map<Character,Integer> countLetters (String str){
        Map<Character,Integer> map = new LinkedHashMap<>();

        for (int i = 0 ; i < str.length(); i++){
            char ch = str.charAt(i); //o // p // a // l // a

            if (map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else {
                map.put(ch,1);
            }
        }
        return map;
    }
}