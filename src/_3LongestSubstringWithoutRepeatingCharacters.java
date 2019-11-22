import java.util.HashMap;
import java.util.HashSet;

public class _3LongestSubstringWithoutRepeatingCharacters {
    /**
     * 3. Longest Substring Without Repeating Characters
     * Given a string, find the length of the longest substring without repeating characters.
     *
     * Example 1:
     * Input: "abcabcbb"
     * Output: 3
     * Explanation: The answer is "abc", with the length of 3.
     *
     * Example 2:
     * Input: "bbbbb"
     * Output: 1
     * Explanation: The answer is "b", with the length of 1.
     *
     * Example 3:
     * Input: "pwwkew"
     * Output: 3
     * Explanation: The answer is "wke", with the length of 3.
     *              Note that the answer must be a substring,
     *              "pwke" is a subsequence and not a substring.
     *
     **/
    /*public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0){ return 0;}
        HashMap<Character, Integer> map = new HashMap<>();
        int res = 0;
        for (int i = 0, j = 0; i < s.length(); i++){
            if (map.containsKey(s.charAt(i))){
                j = Math.max(j, map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i),i);
            res = Math.max(res, i-j+1);
        }
        return res;
    }*/

    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) { return 0; }
        HashSet<Character> set = new HashSet<>();
        int res = 0;
        for (int i =0, j = 0; i < s.length(); i++){
            if (set.contains(s.charAt(i))) {
                for ( int z=j; z<=i; z++) {
                    set.remove(s.charAt(z));
                    if (s.charAt(z) == s.charAt(i)) {
                        j = z + 1;
                        break;
                    }
                }
                set.add(s.charAt(i));
            } else {
                set.add(s.charAt(i));
                res = Math.max(res, set.size());
            }
        }
        return res;
    }
}
