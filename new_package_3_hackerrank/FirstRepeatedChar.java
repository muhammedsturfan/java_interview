package new_package_3_hackerrank;

public class FirstRepeatedChar {


    /*
    You have a string and find first duplicate char

    INPUT opalao
    OUTPUT a
     */

    public static void main(String[] args) {
        String str = "opala";
        System.out.println(firstRepeated(str));
    }

    static String firstRepeated(String str) {
        String ch = "";

        String[] split = str.split("");

        for (int i = 0; i < split.length-1;i++){
            for (int j = i+1 ; j<split.length-1;j++) {
                if (split[i].equals(split[j])) {
                    ch = split[i];
                    return ch;
                }
                }

        }
        return null;
    }
}