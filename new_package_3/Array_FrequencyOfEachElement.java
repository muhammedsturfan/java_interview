package new_package_3;

import java.util.*;

public class Array_FrequencyOfEachElement {
    /*
                Given the array return the output
                testArray = {"Apple","Banana","Apple","Cherry"}
                Output Example
                Apple = 2
                Banana = 1
                Cherry = 1
     */

    public static void main(String[] args) {
        String[] companies = {"Apple","Banana","Apple","Cherry"};
        frequentElements(companies);
    }


    static void frequentElements(String[] companies) {
        HashMap<String,Integer> hashMap = new LinkedHashMap<>();

        for (String each : companies){
            hashMap.put(each, hashMap.getOrDefault(each,0)+1);

        }
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry);
        }
    }
}
