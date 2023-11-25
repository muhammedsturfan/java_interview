package ss;

public class String_FirstUniqueCharacter_SOLUTION {

    /*
    WRITE A PROGRAM RETURN FIRST UNIQUE CHAR

     */

    public static void main(String[] args) {
        String str = "euraopalegue";
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
