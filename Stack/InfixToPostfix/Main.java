import java.util.ArrayDeque;

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

    static void infixToPostfix(String s) {
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            if (isOperand(s.charAt(i)))
                System.out.print(s.charAt(i));
            else if (s.charAt(i) == '(')
                stack.push(s.charAt(i));
            else if (s.charAt(i) == ')') {
                while ((!stack.isEmpty()) && stack.peek() != '(') {
                    System.out.print(stack.pop());
                }
                stack.pop();
            } else if (stack.isEmpty() || operatorPrecedence(s.charAt(i)) > operatorPrecedence(stack.peek())) {
                stack.push(s.charAt(i));
            } else {
                while ((!stack.isEmpty()) && operatorPrecedence(stack.peek()) >= operatorPrecedence(s.charAt(i))) {
                    System.out.print(stack.pop());
                }
                stack.push(s.charAt(i));
            }
        }
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }

    public static void main(String args[]) {
        String expression = "a+b*(c^d-e)^(f+g*h)-i";
        infixToPostfix(expression);
    }
}