package number;

public class Number_Fibonacci {

    /*
    1 1 2 3 5 8 13 21 34 55...... fibonacci numbers.

     */

    public static void main(String[] args) {
        int num = 8;
        System.out.println(fibonacci(num));
    }

    public static int fibonacci(int num) {

        int result = 0;
        int j = 0;
        int z = 1;

        for (int i = 1; i < num; i++) {
            result = j + z;
            j = z;
            z = result;
        }

        return result;
    }


}
