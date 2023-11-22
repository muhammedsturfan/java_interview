package new_package_2_hackerrank;

import java.util.HashSet;

public class remove_duplicates_from_string {

    public static void main(String[] args) {
        String str = "helloworld";
        System.out.println(removedDuplicates(str));
    }

    static String removedDuplicates(String str){

        //We Can use Set, HashSet and StringBuilder for add chars to string

        HashSet<Character> hashSet = new HashSet<>();
        StringBuilder stringBuilder = new StringBuilder();

        for (char c : str.toCharArray()){
            if (!hashSet.contains(c)){
                hashSet.add(c);
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString();
    }
}
