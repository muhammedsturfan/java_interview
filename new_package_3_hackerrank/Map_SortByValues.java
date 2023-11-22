package new_package_3_hackerrank;

import java.util.*;

public class Map_SortByValues {

    /*
        map.put("Volvo",38000);
        map.put("Tesla",32000);
        map.put("Porsche",120000);

        {Tesla=32000, Volvo=38000, Porsche=120000}

     */

    public static void main(String[] args) {
        Map<String,Integer> map = new LinkedHashMap<>();
            map.put("Volvo",3800);
            map.put("Tesla",3200);
            map.put("Porsche", 120000);
            Map<String,Integer> newMap = sortByValue(map);
            System.out.println(newMap);
        }

    static Map<String, Integer> sortByValue(Map<String,Integer> map) {
        List<Map.Entry<String,Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());

        map = new LinkedHashMap<>();

        for (Map.Entry<String,Integer> map2 : list){
            map.put(map2.getKey(), map2.getValue());
        }
        return map;
    }


}