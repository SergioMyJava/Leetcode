package validparentheses;

import java.util.Stack;

public class ValidParentheses {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            char element = s.charAt(i);

            if (element == '}' && stack.size() == 0 || element == ']' && stack.size() == 0 || element == ')' && stack.size() == 0) {
                return false;
            }

            if (element == '{' || element == '[' || element == '(') {
                stack.push(element);
            }

            if (element == '}') {
                char pop = stack.pop();
                if (pop != '{') {
                    return false;
                }
            }
            if (element == ')') {
                char pop = stack.pop();
                if (pop != '(') {
                    return false;
                }
            }
            if (element == ']') {
                char pop = stack.pop();
                if (pop != '[') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
