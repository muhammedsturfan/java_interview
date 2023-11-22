package cc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List_RemoveNameAhmed_SOLVING {


    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Muhammed");
        names.add("Ekrem Abi");
        names.add("Ganyotcu");
        names.add("Dolapdereli Sabri");
        names.add("Fikirtepeli Ozgur");
        System.out.println(names);

        //let's remove "dolapdereli sabri"
        removeName(names);
        for (String name : names){
            System.out.println(name);
        }
    }

    static void removeName(List<String> names){

        names.removeAll(Arrays.asList("Dolapdereli Sabri"));
            }
        }
