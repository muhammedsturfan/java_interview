package string_tasks;

public class String_RemoveDuplicates_SOLVING {

        /*
    Write function that can remove the duplicated values from String
            Ex: removeDup("AAABBBCCC") ==> ABC
     */


    public static void main(String[] args) {
        String str = "AAABBBCCC";
        System.out.println(removeDuplicates(str));

    }

    static String removeDuplicates(String str) {
        String removed = "";

        for (int i = 0 ; i < str.length(); i++){
            if (!removed.contains(""+str.charAt(i))){
                removed+=""+str.charAt(i);
            }
        }
        return removed;
    }
}