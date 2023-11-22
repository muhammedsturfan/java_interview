package new_package_2_hackerrank;

import java.util.TreeSet;

public class string_dictionary_order {

    /*
    Input:
    ["apple", "tomato", "banana", "cherry"]

Output:
    ["apple", "banana", "cherry", "tomato"]
     */

    public static void main(String[] args) {
        String[] str = {"apple", "tomato", "banana", "cherry"};
        dictionaryOrder(str);
    }

    static void dictionaryOrder (String[] str){
        TreeSet<String> treeSet = new TreeSet<>();

        for (String each : str){
            treeSet.add(each);
        }
        System.out.println(treeSet);
    }
}
