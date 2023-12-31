package LeetCode_Package;

public class length_of_last_word {
    public int lengthOfLastWord(String s) {

        String[] split = s.split(" ");

        int length =0;
        int splitLen = split.length;

        String lastWord = split[splitLen-1];
        for(int i = 0 ; i < lastWord.length(); i++){

            length++;
        }
        return length;
    }

}
