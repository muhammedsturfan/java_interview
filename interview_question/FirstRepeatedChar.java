package interview_question;

public class FirstRepeatedChar {

    /*
    You have a string and find first duplicate char

    INPUT opala
    OUTPUT a
     */

    public static void main(String[] args) {
        String str = "opala";
        System.out.println(firstDuplicated(str));
    }
    static char firstDuplicated (String str){


        for (int i = 0 ; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {

                char each = str.charAt(i); //o //p // a
                char compare = str.charAt(j); //p a l a // a l a //l a

                if (each == compare){
                    return each;
                }

            }
        }



        return ' ';
    }
}
