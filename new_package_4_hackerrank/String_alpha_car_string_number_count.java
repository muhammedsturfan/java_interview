package new_package_4_hackerrank;

import com.sun.source.tree.Tree;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class String_alpha_car_string_number_count {

    //String str=" Hih9898jhjh%%^$%^ oio ";
    //find number, alpha char and letter

    public static void main(String[] args) {
        String str=" Hih9898jhjh%%^$%^ oio ";
        System.out.println(findChars(str));

    }

    static int findChars (String str){
        int count = 0;
//        Set<Character> number = new TreeSet<>();
//        Set<Character> letter = new TreeSet<>();
        Set<Character> alpha = new HashSet<>();

        for (Character each : str.toCharArray()){
            if (Character.isLetter(each)){
//                letter.add(each);
            } else if (Character.isDigit(each)) {
//                number.add(each);
            }else {
                alpha.add(each);
                count= alpha.size();
            }

        }
//        System.out.println("Letter: " + letter + " Number: "+ number+ " Alpha: "+alpha);
     return count   ;
    }
}
