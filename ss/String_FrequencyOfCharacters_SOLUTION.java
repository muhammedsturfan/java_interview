package ss;

public class String_FrequencyOfCharacters_SOLUTION {

        /*
        Write function that can find the frequency of characters
        Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
        */

    public static void main(String[] args) {
        String str = "aabbbccdddff";
        System.out.println(frequencyOfChar(str));
    }

    static StringBuilder frequencyOfChar (String str){
        StringBuilder strBld = new StringBuilder();
        for (int i = 0 ; i < str.length();i++) {
            int count = 0;

            if (strBld.indexOf(String.valueOf(str.charAt(i))) != -1){
                continue;
            }

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            strBld.append(str.charAt(i)).append(count);
        }
        return strBld;
    }
}
