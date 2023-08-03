package string_tasks;

public class String_UniqueCharacters_SOLUTION {

        /*
    Write a return method that can find the unique characters from the String
            Ex: unique("AAABBBCCCDEF") ==> "DEF";

     */

    public static void main(String[] args) {
        String str = "AAABBBCCCDEF";
        System.out.println(uniqueChars(str));

    }

    static String uniqueChars(String str) {
        String unique = "";

        for (int i = 0; i<str.length();i++){
            int frequency = 0;
            for (int j =0;j<str.length();j++){
                if (str.charAt(i) == str.charAt(j)){
                    frequency++;
                }
            }
            if (frequency == 1){
                unique += str.charAt(i)+ "";
            }
        }


        return unique;
    }
}