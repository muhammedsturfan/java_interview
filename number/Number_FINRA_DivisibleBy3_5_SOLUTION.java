package number;

public class Number_FINRA_DivisibleBy3_5_SOLUTION {

    public static void main(String[] args) {
        String str = "";
        System.out.println(finraDivisibleBy3And5(str));
    }

    static String finraDivisibleBy3And5 (String str){

        for (int i = 1 ; i <= 30 ; i++){
            if (i % 3 ==0 && i % 5 == 0){
                str += " FINRA";
            } else if (i % 3 ==0) {
                str += " FIN";
            } else if (i % 5 ==0) {
                str += " RA";
            }else {
                str += " "+ i;
            }
        }
        return str;
    }
}
