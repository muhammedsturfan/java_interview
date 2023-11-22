package new_package_hackerrank;

public class FizzBuzz {

    /*
        FizzBuzz. Print numbers from 1 to 30
        - if a number is divisible by 3 print Fizz
        - if a number is divisible by 5 print Buzz
        - if a number is divisible by both 3 and 5 print FizzBuzz
     */
    public static void main(String[] args) {

        for (int i = 1; i <= 30; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                System.out.print("FizzBuzz ");
            } else if (i % 5 == 0) {
                System.out.print("Buzz ");
            } else if (i % 3 == 0) {
                System.out.print("Fizz ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}