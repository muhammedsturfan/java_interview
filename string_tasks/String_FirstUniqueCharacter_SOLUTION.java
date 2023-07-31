package string_tasks;

public class String_FirstUniqueCharacter_SOLUTION {

    /*
    WRITE A PROGRAM RETURN FIRST UNIQUE CHAR

    firstly find unique (I'll use for loop, nested for loop, compare all char step by step
    then we will need find first char. but i need if condition for find unique chars.
     */

    public static void main(String[] args) {
        String str = "europaleague";
        System.out.println(firstUnique(str));
    }

    static char firstUnique (String str) {

        for (int i = 0; i < str.length(); i++) {
            int frequency = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    frequency++;
                }
            }
        if (frequency == 1) {
            return str.charAt(i);
        }

        }
        return ' ';
    }
}
