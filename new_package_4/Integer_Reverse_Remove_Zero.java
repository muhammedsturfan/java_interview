package new_package_4;

public class Integer_Reverse_Remove_Zero {

    public static void main(String[] args) {
        int number = 110200;
        System.out.println(number);

        System.out.println(reverseAndRemoveZero(number));

    }

    static int reverseAndRemoveZero (int number){

//        while (number > 0){
//            int remainder = number%10;
//            if (remainder==0) {
//                number /= 10;
//            }
//            if (remainder !=0){
//                break;
//                }
//            }
        int reversed =0;

        while (number >0){
            int remainder2 = number%10;
            reversed = reversed*10 + remainder2; //2
            number /=10;
        }
        return reversed;
        }
    }