package new_package_4_hackerrank;

public class Longest_String_In_Array {

    //Input Example: {"Java", "Python", "JavaScript", "C++"}
    //Output JavaScript


    public static void main(String[] args) {
        String[] str = {"Java", "Python", "JavaScript", "C++"};
        System.out.println(longestString(str));

    }

    static String longestString(String[] str) {
        String longest ="";
        for (String each : str){
            if (each.length() > longest.length()){
                longest = each;
            }
        }
        return longest;
    }
}