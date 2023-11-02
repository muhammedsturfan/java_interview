package new_package_3;

public class Number_SumAllDigitsUntilOneDigit {

            /*
                Sum all digits of a number until you have one digit number

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
        int number = 45659;
        System.out.println(sumAllDigit(number));

    }

    static int sumAllDigit(int number) {

        while (true) {
            int sum = 0;
            while (number >0) {
                sum += number%10; //9 + 5 + 6 + 5 +4
                number /= 10; //45659 remove 9

            }
            number = sum;
            if (number<10){
                return number;
            }
        }
    }
}