package new_package_2;

public class swap_values_of_two_variables {

    //Swap the values of two variables, x and y, without needing a third variable.

    public static void main(String[] args) {

        int x = 10;
        int y = 12;

        x = x+y; //x will be 22
        y = x-y; //22-12 = 10
        x = x-y; // 22-10 = 12

        System.out.println("x: "+x+" y: "+y);

    }
}
