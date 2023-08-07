package number_tasks;

public class Number_Armstrong_SOLUTION {

    /*
    Armstrong Number 9474 -> 9^4 + 4^4 + 7^4 + 4^4 = 9747
     */


    public static void main(String[] args) {
        int arm = 153;
        System.out.println(isArmstrong(arm));
    }

    static boolean isArmstrong (int arm){
        int originalNumber = arm;
        int sum = 0;

        String str = Integer.toString(arm);
        int length = str.length();

        while (arm != 0){
            // firstly let's get last digit
            int digit = arm % 10; // it will be 3
            // Math.pow(2,3) -> 2^3;
            sum += Math.pow(digit,length);
            //let's remove last digit if we used it.
            arm /= 10;
        }

        return originalNumber == sum;
    }
}