package aa;

public class Array_MoveAllZerosToTheEnd_SOLVING {

    // firstly find zeros and remove them then add zero to the array.
    public static void main(String[] args) {
        int arr [] = {1,0,5,3,2,0,9};
        int [] array = moveAllZerosToTheEnd(arr);
        for (int each : array){
            System.out.println(each);
        }
    }

    public static int[] moveAllZerosToTheEnd (int[] arr) {
        int[] array = new int[arr.length];
        //add two counters
        int countZero = 0;
        int countDigit = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                array[countDigit] = arr[i]; // 1 5 3 2 9
                countDigit++; //0 1 2 3 4
            } else {
                countZero++; // 1 2
            }
        }
        for (int j = 0; j < countZero; j++) {
            array[countDigit + j] = 0;
        }
        return array;
    }
    }