package aa;

public class Array_MaximumProfit_SOLVING {

        /*
We are given an array of prices for a given stock. ith  element of this array represents the price of the stock on  day i.
We are only permitted to complete only one transaction(buy one or sell one share of the stock) per day.
Write a Java function to find the maximum profit.
    Note that a stock can’t be sold before buying.
    Example:
        Input: [8,3,3,1,4,9,12,11]
        Output: 11

    Explanation: Buy on day 4 (price = 1) and sell on day 7 (price = 12), profit = 12-1 = 11.
    Not 8-1 = 7, as the selling price needs to be larger than buying price.
     */

    // min 1 and max 12 output = 11 HOW? 12-1 = 11

    public static void main(String[] args) {
        int[] arr = {8,3,3,1,4,9,12,11};
        maxProfit(arr);
    }

    static int maxProfit(int[] arr){
        int profit = 0;
        int minValue = Integer.MAX_VALUE;

        for (int each : arr){
            if (each < minValue){
                minValue=each;
            }
            else if (each - minValue > profit){
                    profit = (each -minValue);
                }
            }
        System.out.println(profit);
        return profit;
    }
}
