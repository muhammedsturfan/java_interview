package new_package_hackerrank;

public class VowelAndConsonantCount {

    public static void main(String[] args) {
        String str = "heal e25 care i mportan!t";
        System.out.println(countVowelAndConsonant(str));
    }
    static String countVowelAndConsonant(String str){

        int countVowel = 0;
        int countConsonant = 0;

        for (int i = 0 ; i < str.length()-1 ; i++){
            char ch = str.charAt(i);
            if (Character.isLetter(ch)){
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                    countVowel++;
                }else countConsonant++;
            }
        }
        return countConsonant + " " + countVowel;
    }
}
