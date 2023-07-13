package collection_map_tasks;

import java.util.ArrayList;
import java.util.List;

public class List_MoveAllZerosToTheEnd_SOLVING {


    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(0);
        numbers.add(1);
        numbers.add(9);
        numbers.add(0);
        numbers.add(5);

        movingZerosToEnd(numbers);
        System.out.println(numbers);

    }

    static void movingZerosToEnd(List<Integer> numbers){
        int countZeros=0;
        int size = numbers.size();

        for (int i = 0; i < size-countZeros; i++){
            if (numbers.get(i) == 0){
                numbers.remove(i);
                numbers.remove(0);
                countZeros++;
                i--;
            }
        }
    }

}
