package number;

public class Number_FactorialNumber_SOLUTION {

        /*
    Write a return method that returns the factorial number of any given number

        Ex:
                Input: 5
                outPut: 120

                because 5 * 4 * 3 * 2 * 1 = 120
     */

    public static void main(String[] args) {
        int num = 5;
        System.out.println(factorialNumber(num));
    }

    static int factorialNumber (int num){
        int result =1;

        for (int i = 1 ; i <= num ; i++){
            result *= i;
        }
        return result;
    }
}
