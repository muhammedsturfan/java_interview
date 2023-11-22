package at;

public class Array_LargestRectangularArea_SOLVING {

        /*
    Largest Rectangular Area in a Histogram
    Find the largest rectangular area possible in a given histogram where the largest rectangle can be made of
    a number of contiguous bars. For simplicity, assume that all bars have same width and the width is 1 unit.

    For example, consider the following histogram with 7 bars of heights {6, 2, 5, 4, 5, 1, 6}.
     The largest possible rectangle possible is 12
     */

    /*
    min *(max-min +1)
     */

    public static void main(String[] args) {
        int[] arr = {1, 5, 6, 1, 4, 8, 5, 4};
        int result = largestRectangle(arr);
        System.out.println(result);
    }

    static int largestRectangle(int[] arr) {
        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            int minHeight = arr[i];
            for (int j = i; j < arr.length; j++) {
                minHeight = Math.min(minHeight, arr[j]);
                int area = minHeight * (j - i + 1);
                result = Math.max(result, area);
            }
        }

        return result;
    }
}