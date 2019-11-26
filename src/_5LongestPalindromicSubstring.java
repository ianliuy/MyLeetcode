public class _5LongestPalindromicSubstring {
    /**
     * Given a string s, find the longest palindromic substring in s.
     * You may assume that the maximum length of s is 1000.
     *
     * Example 1:
     * Input: "babad"
     * Output: "bab"
     * Note: "aba" is also a valid answer.
     *
     * Example 2:
     * Input: "cbbd"
     * Output: "bb"
     *
     * **/
    public static String longestPalindromeOld(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }
        boolean [][] dp = new boolean[s.length()][s.length()];
        String res = s.substring(0,1);
        int max = 1;
        for (int i = 0; i < s.length(); i++) {
            dp[i][i] = true;
            if (i > 0){
                if (s.charAt(i - 1) == s.charAt(i)) {
                    dp[i -1][i] = true;
                    max = 2;
                    res = s.substring(i - 1, i + 1);
                }
            }
        }
/*        for (int i = 0; i < s.length(); i++) {
            for (int j =0; j < s.length(); j++){
                System.out.printf("%d, %d : %s  ",i,j,dp[i][j]);
            }
            System.out.println();
        }*/
        for (int j = 0; j< s.length(); j++){
            for (int i = 0; i <= j; i++) {
                if (s.charAt(i) == s.charAt(j) && (j - i >= 2) && dp[i + 1][j - 1]) {
                    dp[i][j] = true;
                }
                if (dp[i][j]) {
                    if (j - i + 1> max) {
                        max = j - i + 1;
                        res = s.substring(i, j + 1);
                    }
                }

            }
        }
/*        for (int i = 0; i < s.length(); i++) {
            for (int j =0; j < s.length(); j++){
                System.out.printf("%d, %d : %s  ",i,j,dp[i][j]);
            }
            System.out.println();
        }*/
        return res;
    }
    static String res = "";

    public static String longestPalindrome(String s) {
        if (s == null || s.length() == 0) return s;
        for (int i = 0; i < s.length(); i++){
            helper(s, i, i);
            helper(s, i, i + 1);
        }
        return res;
    }

    public static void helper(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        String cur = s.substring(left + 1, right);
        if (cur.length() > res.length())
            res = cur;
    }

        public static void main(String[] args){
        String sss = "";
        sss = longestPalindrome("abdkbab");
        System.out.println(sss);
    }

}
