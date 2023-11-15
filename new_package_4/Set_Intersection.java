package new_package_4;

import java.util.*;

public class Set_Intersection {
    /*
    Input:
    Set 1: {apple, orange, banana}
    Set 2: {banana, grape, apple}
    Output:
    Intersection Set: {apple, banana}
     */

    public static void main(String[] args) {

        Set<String> set1 =new LinkedHashSet<>(Arrays.asList("apple","orange","banana"));
        Set<String> set2 = new LinkedHashSet<>(Arrays.asList("banana", "grape", "apple"));

        System.out.println(intersection(set1,set2));


    }

    static Set<String> intersection (Set<String> set1, Set<String> set2){
        Set<String> newSet = new LinkedHashSet<>();


        for (String each1 : set1){ //apple
            for (String each2 : set2){
                if (each1.equals(each2)){
                    newSet.add(each1);
                }
            }
        }
        return newSet;
    }
}
