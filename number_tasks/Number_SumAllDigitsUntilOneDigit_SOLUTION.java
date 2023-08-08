package number_tasks;

public class Number_SumAllDigitsUntilOneDigit_SOLUTION {

        /*
    Sum all digits of a number until you have one digit number
    EX:
        input: 45659
        output:
                29
                11
                2
        Explanation:
                4+5+6+5+9=29
                2+9=11
                1+1=2
     */
        public static void main(String[] args) {
            int n = 45659;
            System.out.println(sumUntilOneDigit(n));
        }

    static int sumUntilOneDigit (int n){

            while (true) {
                int sum = 0;
                while (n > 0) {
                    //let's get last digit
                    sum += n % 10;
                    //then remove it
                    n /= 10;
                }
                n = sum;
                if (n < 9){
                    break;
                }
            }
            return n;
    }
}
