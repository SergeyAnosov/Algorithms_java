import java.util.Stack;

public class CheckBracketsOnString {

    public Boolean checkString(String input) {

        int size = input.length();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < size; i++) {
            if (input.charAt(i) == '(') {
                stack.push(input.charAt(i));
            }
            if (stack.isEmpty() && input.charAt(i) == ')') {
                return false;
            } else if (!stack.isEmpty() && input.charAt(i) == ')') {
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
