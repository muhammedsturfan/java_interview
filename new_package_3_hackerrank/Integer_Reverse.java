package new_package_3_hackerrank;

public class Integer_Reverse {


    public static void main(String[] args) {
        int number = 000111;

        System.out.println(reverseInt(number));
    }

    static int reverseInt (int number){
        int newNumber=0;

        while (number>0){

            int digit = number%10; //take last digit

            newNumber = newNumber*10+ digit;

            number /= 10; //remove last digit
        }

        return newNumber;
    }
}
