package other;

public class random {

    /*
    Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number.
nearHundred(93) → true
nearHundred(90) → true
nearHundred(89) → false
     */

    public static void main(String[] args) {
        System.out.println(nearHundred(89));
        System.out.println(nearHundred(91));
        System.out.println(nearHundred(111));

    }

    static boolean nearHundred(int n){



        if ((n >= 90 && n <=110) || (190 <= n && 210 >= n)){
            return true;
        }


        return false;
    }
    }
