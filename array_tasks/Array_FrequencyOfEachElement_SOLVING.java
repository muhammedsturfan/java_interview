package array_tasks;

import java.util.LinkedHashMap;
import java.util.Map;

public class Array_FrequencyOfEachElement_SOLVING {

        /*
    Given the array return the output
                testArray = {"Apple","Banana","Apple","Cherry"}
                Output Example
                Apple = 2
                Banana = 1
                Cherry = 1
     */

    public static void main(String[] args) {
        String[] companies = {"Apple","Playstation","Playstation","Cepheid","Black Rock","S&P 500","S&P 500"};
        frequentElements(companies);
    }

    static int frequentElements(String[] companies){
        int frequency = 0;

        Map<String,Integer> map = new LinkedHashMap<>();

        for (String each : companies){
            int count = 0;
            for (String each1 : companies){
                if (each.equals(each1)){
                    count++;
                }
            }
            map.put(each,count);
        }

        for (Map.Entry<String,Integer> result : map.entrySet()){
            System.out.println(result);
        }


        return frequency;
    }
}
