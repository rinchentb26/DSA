import java.util.Scanner;
import java.util.Stack;

class Main {
    public static boolean checkPair(char close_brac, char open_brac) {
        if (open_brac == '{' && close_brac == '}' || open_brac == '(' && close_brac == ')' || open_brac == '[' && close_brac == ']')
            return true;
        else
            return false;
    }

    public static boolean checkParanthesis(String str) {
        Stack<Character> s = new Stack<>();
        char ch;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            if (ch == '{' || ch == '(' || ch == '[') {
                s.push(ch);
            } else if (ch == '}' || ch == ')' || ch == ']') {
                if (s.isEmpty())
                    return false;
                else {
                    char popped = s.pop();
                    if (!checkPair(ch, popped))
                        return false;
                }
            }
        }
        if (s.isEmpty())
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your expression: ");
        s = sc.nextLine();
        System.out.println("Expression: " + s);
        System.out.println(checkParanthesis(s));
        sc.close();
    }
}