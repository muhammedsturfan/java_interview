package ss;

public class String_CountOfRepeatedChars_SOLUTION {

    /*
    aabcccddaaaa -->  a2b1c3d2a4
     */

    public static void main(String[] args) {
        String str = "aaabbc";
        countRepeat(str);
    }

    static void countRepeat(String str){
        StringBuilder sb = new StringBuilder();
        int count = 1;

        for (int i = 0 ; i< str.length() -1 ; i++){
            if (str.charAt(i) == str.charAt(i+1)){
                count++;
            }else {
                sb.append(str.charAt(i)).append(count);
                count=1;
            }
        }
        sb.append(str.charAt(str.length()-1)).append(count);

        sb.toString();
        System.out.println(sb);
        }
    }