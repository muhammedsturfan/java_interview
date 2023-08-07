package number_tasks;

public class Number_BinaryRepresentationOfN_SOLUTION {

    /*
    Binary number of '7'                Binary number of '8'

    7/2 = 3 and remainder '1'           8/2 = 4 and remainder '0'
    3/2 = 1 and remainder '1'           4/2 = 2 and remainder '0'
    1/2 = 0 and remainder '1'           2/2 = 1 and remainder '0'
                                        1/2 = 0 and remainder '1'

    So binary number of 7 is 111        binary number of 8 is 1000
     */

    public static void main(String[] args) {
        int num = 8;
        System.out.println(binaryNumber(num));

    }

    static String binaryNumber(int num){

        if (num == 0){
            return "0";
        }
        StringBuilder str = new StringBuilder();

        while (num > 0) {
            int add = num % 2;
            str.append(add);
            num /= 2;
        }

        return str.reverse().toString();
    }
}