package collection_map_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List_MoveAllZerosToTheEnd {

    /*
    write a program that can move all the zeros to the end of the List of integers
     */

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(0);
        numbers.add(7);
        numbers.add(0);
        numbers.add(3);
        numbers.add(0);
        numbers.add(2);
        numbers.add(0);
        numbers.add(9);

        moveZerosToEnd(numbers);

        System.out.println(numbers);
    }

    static void moveZerosToEnd(List<Integer> numbers) {
        int countZeros = 0;
        int size = numbers.size();

        for (int i = 0; i < size - countZeros; i++) {
            if (numbers.get(i) == 0) {
                numbers.remove(i);
                numbers.add(0);
                countZeros++;
                i--;
            }
        }
    }
}
