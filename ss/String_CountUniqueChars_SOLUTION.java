package ss;

public class String_CountUniqueChars_SOLUTION {

        /*
        Write a Java program to count unique Characters in string.
        Given a string as input, write Java code to count and print the number of unique characters in String.
        If there are no unique characters in the string, the method returns -1
        */


    public static void main(String[] args) {
        String str = "aaabbbcddf";
        System.out.println(countUnique(str));
    }

    static int countUnique(String str) {
        int count = 0;

        for (int i = 0 ; i< str.length() ; i++){
            int frequency=0;
            for (int j =0; j<str.length();j++)
            if (str.charAt(i) == str.charAt(j)){
                frequency++;
            }
            if (frequency==1){
                count++;
            }
        }
        return (count == 0) ? -1 : count;
    }
}
