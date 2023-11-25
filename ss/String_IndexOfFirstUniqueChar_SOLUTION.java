package ss;

public class String_IndexOfFirstUniqueChar_SOLUTION {

        /*
    Given a string, find the first non-repeating character in it and return its index.
    If it doesn't exist, return -1.

    input String str = "aaabbcddeef";
    output = 5
     */

    public static void main(String[] args) {
        String str = "aaabbcddeef";
        System.out.println(indexOfFirstUniqueChar(str));
    }

    static int indexOfFirstUniqueChar(String str){
        int index = 0;

        for (int i = 0 ; i < str.length(); i++) {
            int frequency = 0;
            for (int j =0; j < str.length(); j++){
                if (str.charAt(i) == str.charAt(j)){
                    frequency++;
                }
            }
            if (frequency == 1){
                return i;
            }
        }

        return -1;
    }
    }
