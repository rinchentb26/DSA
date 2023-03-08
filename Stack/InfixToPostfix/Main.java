import java.util.Scanner;
import java.util.Stack;

class Main {
    static void convertToPostfix(String str) {
        Stack<Character> s = new Stack<>();
        String post_exp = "";
        char ch;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            // if operand directly add to result
            if (isOperand(ch)) {
                post_exp += ch;
            }
            /*
             * if operator, push if -> stack is empty
             * -> precedence is greater than precedence of top item in stack
             * if precedence is small
             * -> pop and add to result until precedence of current operator is greater or
             * stack is empty
             * -> push operator to stack
             * 
             */

            else if (isOperator(ch)) {
                if (s.isEmpty() || getPrecedence(ch) > getPrecedence(s.peek()))
                    s.push(ch);
                else {
                    while ((!s.isEmpty()) && (getPrecedence(ch) <= getPrecedence(s.peek()))) {
                        post_exp += s.pop();
                    }
                    s.push(ch);
                }
            }
            /*
             * if it is opening bracket simply push to stack,
             * if it is closing bracket pop all items from stack and add to result
             * until closing brace is found
             */
            else {
                if (ch == '(')
                    s.push(ch);
                else {
                    char popped;
                    while ((!s.isEmpty()) && ((popped = s.pop()) != '(')) {
                        post_exp += popped;
                    }
                }
            }
        }
        // after iterating through the expression, make sure stack is empty by popping
        // all elements and add to res
        while (!s.isEmpty()) {
            post_exp += s.pop();
        }
        System.out.println("Converted Postfix Expression: " + post_exp);

    }

    static boolean isOperand(char ch) {
        if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z' || ch >= '0' && ch <= '9')
            return true;
        return false;
    }

    static boolean isOperator(char ch) {
        if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^' || ch == '$')
            return true;
        return false;
    }

    public static int getPrecedence(char ch) {
        if (ch == '^' || ch == '$')
            return 3;
        else if (ch == '*' || ch == '/')
            return 2;
        else if (ch == '+' || ch == '-')
            return 1;
        else
            return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String expression;
        System.out.print("Enter Infix Expression: ");
        expression = sc.next();
        System.out.println("Infix Expression: " + expression);
        convertToPostfix(expression);
        sc.close();

    }
}