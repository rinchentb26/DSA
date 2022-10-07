import java.util.*;

class Main {
    static boolean checkPair(char c1, char c2) {
        if (c1 == '{' && c2 == '}' || c1 == '[' && c2 == ']' || c1 == '(' && c2 == ')')
            return true;
        else
            return false;
    }

    public static Boolean checkBalanced(String s) {

        ArrayDeque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            } else {
                if (stack.isEmpty())
                    return false;
                char ch = stack.pop();
                if (!checkPair(ch, s.charAt(i)))
                    return false;
            }
        }
        if (stack.isEmpty())
            return true;
        else
            return false;
    }

    public static void main(String args[]) {
        String s = "({})[]";
        System.out.println(checkBalanced(s) ? "Balanced." : "Not Balanced");
    }
}