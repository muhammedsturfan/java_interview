package string_tasks;

public class String_Reverse_SOLUTION {

    public static void main(String[] args) {
        String str = "kopek";
        System.out.println(reversedString(str));

    }

    static String reversedString (String str){
        String reversed = "";

        for (int i = str.length()-1; i >= 0; i--){
            reversed += ""+str.charAt(i);
        }
        return reversed;
    }
}
