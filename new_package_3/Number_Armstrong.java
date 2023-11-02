package new_package_3;

import java.util.Arrays;

public class Number_Armstrong {

        /*
                Armstrong Number 9474 -> 9^4 + 4^4 + 7^4 + 4^4 = 9747
        */

    public static void main(String[] args) {
        int arm = 9474;
        System.out.println(isArmstrong(arm));
    }

    static boolean isArmstrong (int arm) {
        int total = 0;

        int length = Integer.toString(arm).length();
        char[] armArray = Integer.toString(arm).toCharArray();


        for (int i = 0 ; i < length ; i++){
            int charr = Integer.parseInt(String.valueOf(armArray[i]));
            total += Math.pow(charr,length);
            System.out.println("total: "+ total);
            if (total == arm){
                return true;
            }
        }
        return false;
    }
}