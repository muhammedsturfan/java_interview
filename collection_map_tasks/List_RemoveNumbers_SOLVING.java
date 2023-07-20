package collection_map_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List_RemoveNumbers_SOLVING {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(99, 100, 101, 102, 103));

        removeOver100(list);
        for (int number : list){
            System.out.println(number);
        }
    }

    static void removeOver100(List<Integer> list) {
        List<Integer> toRemove = new ArrayList<>();
        for (int number : list) {
            if (number > 100){
                toRemove.add(number);
            }
        }
        list.removeAll(toRemove);
    }
}
