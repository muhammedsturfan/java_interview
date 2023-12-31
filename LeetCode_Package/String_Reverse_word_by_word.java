package LeetCode_Package;

import java.util.ArrayList;
import java.util.List;

public class String_Reverse_word_by_word {


    /*
    edistuo si ynnus

     */


    public static void main(String[] args) {
        String str = "outside is sunny";
        System.out.println(reversed(str));
    }
    static String reversed(String str){
        List<String> list = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();

        String[] split = str.split(" ");

        for (String word : split){
            list.add(word);
        }


        for (int i =0 ; i < list.size(); i++){
            String getString = list.get(i) + " ";
            for (int j = getString.length()-1; j >= 0 ;j--){
                stringBuilder.append(getString.charAt(j));


            }
        }
        return stringBuilder.toString();
    }

}
