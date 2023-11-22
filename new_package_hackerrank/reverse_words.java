package new_package_hackerrank;

public class reverse_words {

    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(reversedWords(str));
    }

    static String reversedWords (String str){
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = str.length()-1; i >= 0 ; i--){
            stringBuilder.append(str.charAt(i));
        }
        return stringBuilder.toString();
    }
}
