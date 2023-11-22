package new_package_hackerrank;

public class string_reverse {

    public static void main(String[] args) {

        String str = "opala";
        System.out.println(reversed(str));
    }

    static String reversed (String str){
        StringBuilder strbld = new StringBuilder();

        for (int i = str.length()-1;i >= 0 ; i--){
            strbld.append(String.valueOf(str.charAt(i)));
        }
        return strbld.toString();
    }
}
