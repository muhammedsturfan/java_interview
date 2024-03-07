package number;

public class Number_Fibonacci_SOLUTION {

        /*
            1 1 2 3 5 8 13 21 34 55...... fibonacci numbers.


        */


    public static void main(String[] args) {
        int num = 8;
        System.out.println(fibonacci(num));
    }

    static int fibonacci(int num){
        int num1 = 1;
        int num2 = 0;
        int result = 0;

        for (int i = 1 ; i < num ; i++){
            result = num1 + num2;
            num2 = num1;
            num1 = result;
        }

        return result;
    }

}
