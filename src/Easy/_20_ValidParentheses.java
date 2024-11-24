package Easy;

import java.util.Stack;

public class _20_ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);

            if (current == '{' || current == '[' || current == '(') {
                stack.push(current);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                // pop lấy phần tử ở vị trí đầu tiên trên stack
                char top = stack.pop();
                if ((current == '}' && top != '{') ||
                        (current == ']' && top != '[') ||
                        (current == ')' && top != '(')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        _20_ValidParentheses validator = new _20_ValidParentheses();
        String s1 = "{ ( [ ] ) }";
        System.out.println(validator.isValid(s1));  // Output: true
    }
}
