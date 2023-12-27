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

    public Boolean fullCheck(String input) {
        if (input.isEmpty()) {
            return false;
        }
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '(' ||
                    c == '[' ||
                    c == '{') {
                stack.push(c);
            }
            if ((c == ')' || c == ']' || c == '}')) {
                if (stack.isEmpty()) {
                    System.out.println("Ошибка на символе номер: " + i + "; символ: " + c);
                    return false;
                } else {
                    Character pop = stack.pop();
                    if ((c == ')' && pop != '(') ||
                            (c == ']' && pop != '[') ||
                            (c == '}' && pop != '{')) {
                        return false;
                    }
                }

            }
        }
        return stack.isEmpty();
    }
}
