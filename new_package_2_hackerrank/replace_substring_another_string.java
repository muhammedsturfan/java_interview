package new_package_2_hackerrank;

public class replace_substring_another_string {

    public static void main(String[] args) {
        String original = "Hello world, how is it today in world?";
        String target = "world";
        String replace = "universe";

        String replacedString = original.replace(target,replace);

        System.out.println(replacedString);
    }
}
