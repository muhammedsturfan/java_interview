package Veeva_Interview_Package;

public class Palindromic_Substring {

    public class PalindromicSubstrings {

        public int countSubstrings(String s) {
            int count = 0;

            for (int i = 0; i < s.length(); i++) {
                count += countPalindromes(s, i, i);       // Count odd-length palindromes
                count += countPalindromes(s, i, i + 1);   // Count even-length palindromes
            }

            return count;
        }

        public int countPalindromes(String s, int left, int right) {
            int count = 0;

            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                count++;
                left--;
                right++;
            }

            return count;
        }
    }

}
