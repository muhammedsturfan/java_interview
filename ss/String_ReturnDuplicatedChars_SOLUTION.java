package ss;

public class String_ReturnDuplicatedChars_SOLUTION {

    /*
               input: inteerrrviiew
               output:  ier
        create method return duplicated unique value
    */


    public static void main(String[] args) {
        String str = "coodingg";
        System.out.println(ReturnDuplicates(str));
    }

    static String ReturnDuplicates(String str){
        String result = "";


        for (int i = 0; i <str.length();i++){
            int frequency = 0;
            for (int j = 0; j<str.length();j++){
                if (str.charAt(i) == str.charAt(j)){
                    frequency++;
                }
                if (frequency > 1 && !result.contains(""+str.charAt(i))){
                    result += str.charAt(i);
                }
            }
        }
        return result;
    }
}
