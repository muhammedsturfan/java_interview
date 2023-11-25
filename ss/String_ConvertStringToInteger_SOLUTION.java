package ss;

public class String_ConvertStringToInteger_SOLUTION {

    public static void main(String[] args) {
        String str = "1234";
        System.out.println(str + " String version");
        convertStringToInteger(str);

    }

    static int convertStringToInteger(String str){
        int intType = 0;


        for (int i = 0 ; i< str.length(); i++){
            int result = str.charAt(i) - '0';
            intType = intType * 10 + result;
        }
        System.out.println(intType);


        return intType;
    }
}
