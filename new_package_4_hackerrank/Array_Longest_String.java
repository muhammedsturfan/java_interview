package new_package_4_hackerrank;

public class Array_Longest_String {

    public static void main(String[] args) {
        String[] str = {"java","array","ibm"};
        System.out.println(longestString(str));
    }

    static String longestString (String[] str){
        int min = Integer.MIN_VALUE;
        String longest = "";

        for (String each : str){

            if (each.length() > min){
                longest = each;
                min = each.length();
            }
        }

        return longest;
    }
}
