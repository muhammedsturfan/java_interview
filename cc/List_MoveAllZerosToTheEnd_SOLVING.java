package cc;

import java.util.ArrayList;
import java.util.List;

public class List_MoveAllZerosToTheEnd_SOLVING {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(0);
        list.add(6);
        list.add(5);
        list.add(9);
        moveZerosToEnd(list);
    }

    static void moveZerosToEnd(List<Integer> list) {
        int count = 0;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 0) {
                count ++;
                list.remove(i);
                i--;
            }

            for (int j = 0 ; j < count; j++){
                list.add(0);
            }
        }
    }

}
