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

            switch (element) {
                case '}':
                    stack = chekBrakets('{', stack);
                    break;
                case ']':
                    stack = chekBrakets('[', stack);
                    break;
                case ')':
                    stack = chekBrakets('(', stack);
                    break;
            }
//            if (element == '}') {
//                char pop = stack.pop();
//                if (pop != '{') {
//                    return false;
//                }
//            }
//            if (element == ')') {
//                char pop = stack.pop();
//                if (pop != '(') {
//                    return false;
//                }
//            }
//            if (element == ']') {
//                char pop = stack.pop();
//                if (pop != '[') {
//                    return false;
//                }
//            }
        }
        return stack.isEmpty();
    }

    public Stack<Character> chekBrakets(char bracket, Stack<Character> stack) {
        char pop = stack.peek();
        if (pop != bracket) {
            stack.push(pop);
            return stack;
        }
        stack.pop();
        return stack;
    }

    public static void main(String[] args){
        ValidParentheses exp = new ValidParentheses();
        System.out.println(exp.isValid("(((((())))))"));
    }
}