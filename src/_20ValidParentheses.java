import java.util.Stack;

public class _20ValidParentheses {
    /**
     * 20. Valid Parentheses
     * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
     * An input string is valid if:
     * Open brackets must be closed by the same type of brackets.
     * Open brackets must be closed in the correct order.
     * Note that an empty string is also considered valid.
     *
     * Example 1:
     * Input: "()"
     * Output: true
     *
     * Example 2:
     * Input: "()[]{}"
     * Output: true
     *
     * Example 3:
     * Input: "(]"
     * Output: false
     *
     * Example 4:
     * Input: "([)]"
     * Output: false
     *
     * Example 5:
     * Input: "{[]}"
     * Output: true
     * */
    public boolean isValid(String s) {
        if (s == null || s.length() == 0) return true;
        Stack<Character> stack = new Stack<>();
        for (Character ch : s.toCharArray()) {
            if (ch == '(') stack.push(')');
            else if (ch == '[') stack.push(']');
            else if (ch == '{') stack.push('}');
            else {
                if (stack.isEmpty() || stack.pop() != ch) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    /**
     * 方法需要记住
     * 很巧妙，如果遇到左边，压入右边；如果遇到右边，弹出stack并与之比较
     * 判断false条件：任一次比较不一致/结束后栈不空
     * */
}
