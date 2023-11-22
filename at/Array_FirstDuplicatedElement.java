package at;

public class Array_FirstDuplicatedElement {

    /*
    write a program that can find the first duplicated element from the array
     */

    public static void main(String[] args) {
        int[] array = {1,2,4,5,5,1};
        firstDuplicatedElement(array);
    }

    public static int firstDuplicatedElement(int[] array) {
        int firstDuplicated = 0;

        for (int each : array) {
            int frequency = 0;
            for (int each2 : array) {
                if (each == each2)
                    frequency++;
            }

            if (frequency > 1) {
                firstDuplicated = each;
                break;
            }

        }
        System.out.println(firstDuplicated);

        return firstDuplicated;

    }


}
