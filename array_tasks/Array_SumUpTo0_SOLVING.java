package array_tasks;

public class Array_SumUpTo0_SOLVING {

        /*
    Write a function:
        that, given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0.
        The function can return any such array.
        For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5].
        The answer [1, -1,1,3] would be incorrect (because value 1 occurs twice).
        For N = 3 one of the possible answers is [-1,0,1] (but there are many more correct answers).
     */

    public static void main(String[] args) {
        int n = 4;
        int[] arr = sumUpToZero(n);
        for (int each : arr){
            System.out.println(each);
        }

    }

    static int[] sumUpToZero (int n){
        int[] arr = new int[n];
        int sum = 0;

        for (int i = 0 ; i < n -1 ; i ++){
            arr[i] = i;
            sum+= i; // arr[0] -1 + 4 + 2 ==> 3
        }
        arr[n-1] = -sum;

        return arr;
    }

}
