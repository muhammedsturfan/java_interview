package array_tasks;

import java.util.LinkedHashMap;
import java.util.Map;

public class Array_FrequencyOfEachElement_WithWord_SOLVING {

        /*
     int[]arr = {1,2,3,4,3,2,1,3,2,2,2,4};
write a program that should count each number and prints a sentence to say how many times a number is repeated example:
        1 is two,
        3 is three,
        4 is two.
        2 is five
     */


    public static void main(String[] args) {
        int[]arr = {1,2,3,4,3,2,1,3,2,2,2,4};
        frequencyWord(arr);
    }

    public static void frequencyWord(int[] arr){
        String[] sentence = {"one","two","three","four","five","six","seven","eight","nine","ten"};

        Map<Integer,Integer> map = new LinkedHashMap<>();

        for (int number : arr){
            map.put(number, map.getOrDefault(number,0) +1);
            }

        for (Map.Entry<Integer,Integer> newMap : map.entrySet()){
            System.out.println(newMap.getKey() + " is " + sentence[newMap.getValue()]);
        }
        }

    }