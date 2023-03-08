import java.util.Scanner;
import java.util.Stack;

class Main {
    static boolean isOperand(char ch) {
        return ch >= '0' && ch <= '9';
    }

    static private int evaluate(String s) {
        Stack<Integer> stack = new Stack<>();
        char ch;
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if (isOperand(ch))
                stack.push(ch - '0');
            else {
                int b = stack.pop();
                int a = stack.pop();

                switch (ch) {
                    case '+':
                        stack.push(a + b);
                        break;
                    case '-':
                        stack.push(a - b);
                        break;
                    case '*':
                        stack.push(a * b);
                        break;
                    case '/':
                        stack.push(a / b);
                        break;
                }
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String expression;
        System.out.print("Enter postfix expression: ");
        expression = sc.next();
        System.out.println("Result: " + evaluate(expression));
    }
}