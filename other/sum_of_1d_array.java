package other;

public class sum_of_1d_array {



    // int array = {1,2,3,5};
    // RESULT 1 3 6 11

    public static void main(String[] args) {
        int[] numb = {1,2,4,5};

        int[] result = runningSum(numb);
        for (int num : result){
            System.out.println(num);
        }


    }
    public static int[] runningSum(int[] numb){

        int[] newArray = new int[numb.length];

        int sum = 0;

        for (int i = 0; i < numb.length ; i++){
            sum += numb[i];
            newArray[i] = sum;

        }
        return newArray;
    }
}

