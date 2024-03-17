package LeetCode_Package;

import java.util.HashSet;

public class leetcode_202_happy_number {

    public boolean isHappy(int n) {

        HashSet<Integer> seenSet = new HashSet<>();

        while (n != 1){
            int totalSum = 0;
            while (n >0){
                int digit = n%10;
                totalSum+= digit*digit;
                n/=10;
            }
            if(seenSet.contains(totalSum)){
                return false;
            }
            seenSet.add(totalSum);
            n=totalSum;

        }

        return true;



    }
}
