package new_package_3;

public class Array_FirstDuplicatedElement {

    /*
    write a program that can find the first duplicated element from the array
    */
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 4, 5, 1};
        System.out.println(firstDuplicatedElement(array));
    }
    public static int firstDuplicatedElement( int[] array){
        int duplicated = 0;
        for (int i = 0 ; i < array.length ; i++){
            for (int j = i+1; j < array.length; j++){
                if (array[i] == array[j]){
                    duplicated = array[i];
                    return duplicated;
                }
            }
        }

        return -1; //flag, it's mean everything checked.
    }

}