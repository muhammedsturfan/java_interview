package interview_questions;

public class Integer_Reverse_Remove_Zero {


    public static void main(String[] args) {
        int N = 102100;
        reverse(N);
    }

    static void reverse(int N) {
        int enable_print = N % 10;
        while (N > 0) {
            if (enable_print == 0 && N % 10 != 0) {
                enable_print = 1;
            }
            if (enable_print >= 1) {
                System.out.print(N % 10);  // Correct the print syntax
            }
            N = N / 10;
        }
    }
}