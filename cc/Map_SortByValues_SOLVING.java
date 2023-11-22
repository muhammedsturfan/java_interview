package cc;

import java.util.*;

public class Map_SortByValues_SOLVING {

    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("Volvo",38000);
        map.put("Tesla",32000);
        map.put("Porsche",120000);

        Map<String,Integer> convertedMap = sortByValue(map);
        System.out.println(convertedMap);
    }

    static Map<String, Integer> sortByValue(Map<String,Integer> map){
        List<Map.Entry<String,Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());

        map = new LinkedHashMap<>();

        for (Map.Entry<String,Integer> each : list){
            map.put(each.getKey(), each.getValue());
        }
        return map;
    }
}