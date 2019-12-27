import java.util.ArrayList;
import java.util.List;

public class _22GenerateParentheses {
    /**
     * 22. Generate Parentheses
     * Given n pairs of parentheses, write a function to generate all combinations
     * of well-formed parentheses.
     *
     * For example, given n = 3, a solution set is:
     * [
     *   "((()))",
     *   "(()())",
     *   "(())()",
     *   "()(())",
     *   "()()()"
     * ]
     * */
    public static List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        if (n == 0) return res;
        helper (res, "", n, n);
        return res;
    }
    public static void helper (List<String> res, String s, int left, int right) {
        if (left > right) {
            return;
        }
        if (left == 0 && right == 0) {
            res.add(s);
            return;
        }
        if (left > 0) {
            helper(res, s + "(", left - 1, right);
        }
        if (right > 0) {
            helper(res, s + ")", left, right - 1);
        }
    }
    /**
     * 1. 这道题为什么要新建List<String>: 因为函数的返回值是List<String>
     * 2. 新建List<String>的方法：List<String> xxx = new ArrayList<>();
     * 3. 别的思路简单，就是一个递归。
     * */
}
