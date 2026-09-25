import java.util.Stack;
public class BracketChecker {
    public static boolean isBalanced(String str) {
        if (str == null) {
            System.out.println("Некорректный ввод");
            return false;
        }
        if (str.isEmpty()) {
            return true;
        }
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char open = stack.pop();
                if ((c == ')' && open != '(') ||
                        (c == '}' && open != '{') ||
                        (c == ']' && open != '[')) {
                    return false;
                }
            }
            else {
                System.out.println("Некорректный ввод");
                return false;
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        System.out.println(isBalanced(""));
        System.out.println(isBalanced("[]"));
        System.out.println(isBalanced("[](){}"));
        System.out.println(isBalanced("[({})]"));
        System.out.println(isBalanced("[({}()){}]"));
        System.out.println(isBalanced("{]"));
        System.out.println(isBalanced("({)}"));
        System.out.println(isBalanced("("));
        System.out.println(isBalanced(")"));
        System.out.println(isBalanced("a(b)c"));
        System.out.println(isBalanced("( )"));
    }
}