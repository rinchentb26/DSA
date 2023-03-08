import java.util.ArrayDeque;

/*
 *  1) Reverse Expression
 * 2) Fix Brackets
 * 3) Find Postfix
 * 4) Reverse Postfix 
 */
class Main {
    static boolean isOperand(char c) {
        if (Character.isLetter(c))
            return true;
        else
            return false;
    }

    static int operatorPrecedence(char c) {
        if (c == '^')
            return 3;
        else if (c == '*' || c == '/')
            return 2;
        else if (c == '+' || c == '-')
            return 1;
        else
            return 0;
    }

    static void infixToPrefix(String s) {
        ArrayDeque<Character> stack = new ArrayDeque<>();
        StringBuffer s1 = new StringBuffer(s);
        StringBuffer res = new StringBuffer(50);
        s1.reverse();
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == '(')
                s1.setCharAt(i, ')');
            else if (s1.charAt(i) == ')')
                s1.setCharAt(i, '(');
        }
        for (int i = 0; i < s1.length(); i++) {
            if (isOperand(s1.charAt(i)))
                res.append(s1.charAt(i));
            else if (s1.charAt(i) == '(')
                stack.push(s1.charAt(i));
            else if (s1.charAt(i) == ')') {
                while ((!stack.isEmpty()) && stack.peek() != '(') {
                    res.append(stack.pop());
                }
                stack.pop();
            } else if (stack.isEmpty() || operatorPrecedence(s1.charAt(i)) > operatorPrecedence(stack.peek())) {
                stack.push(s1.charAt(i));
            } else {
                while ((!stack.isEmpty()) && operatorPrecedence(stack.peek()) >= operatorPrecedence(s1.charAt(i))) {
                    res.append(stack.pop());
                }
                stack.push(s1.charAt(i));
            }
        }
        while (!stack.isEmpty()) {
            res.append(stack.pop());
        }
        res.reverse();
        System.out.println(res);
    }

    public static void main(String args[]) {
        String expression = "a+b*(c^d-e)^(f+g*h)-i";
        infixToPrefix(expression);
    }
}