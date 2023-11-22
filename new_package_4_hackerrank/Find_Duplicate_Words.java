package new_package_4_hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Find_Duplicate_Words {

    //write a method that finds the duplicate words in a string with each word being separated by spaces
    //note: there should be no duplicates in the return array
    //note: capitalization is matter
    //input : "Today is a really sunny dat I hope tomorrow will be a sunny day also"
    //output: ["sunny","day","a"]


    public static void main(String[] args) {
        String str = "Today is a really sunny day I hope tomorrow will be a sunny day also";
        System.out.println(Arrays.toString(findDuplicateWords(str)));
    }

    static String[] findDuplicateWords (String str){
        List<String> list = new ArrayList<>();

        String[] split = str.split(" ");

        for (String each1: split){
            int count = 0 ;
            for (String each2 : split){
                if (each1.equals(each2)){
                    count++;
                }
                if (count>1){
                    if (!list.contains(each1)) {
                        list.add(each1);
                    }
                }
            }
        }
        return list.toArray(new String[0]);
    }

}
