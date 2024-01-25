import java.util.Stack;

public class Brackets {
    public static void main(String[] args) {
        String brackets = "{[()]}";
        System.out.println(isValid(brackets));  // true

        brackets = "{[(])}";
        System.out.println(isValid(brackets)); //false

        brackets = "{{{}}}";
        System.out.println(isValid(brackets));//true

        brackets = ")";
        System.out.println(isValid(brackets));//false
    }

    public static boolean isValid(String brackets) {
        Stack<Character> stack = new Stack<>();
        for (char bracket : brackets.toCharArray()) {
            if (bracket == '(' || bracket == '{' || bracket == '[') {
                stack.push(bracket);
            } else if (bracket == ')' || bracket == '}' || bracket == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((bracket == ')' && top !=
                        '(') || (bracket == '}' && top !=
                        '{') || (bracket == ']' && top !=
                        '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}


