import java.util.Scanner;
import java.util.Stack;

public class BracketValidationSystem {

    public static boolean isMatching(char left, char right) {
        return (left == '(' && right == ')')
                || (left == '[' && right == ']')
                || (left == '{' && right == '}');
    }

    public static boolean validateBrackets(String text) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')' || ch == ']' || ch == '}') {

                if (stack.isEmpty()) {
                    System.out.println("錯誤：缺少左括號，位置在第 "
                            + (i + 1) + " 個字元。");
                    return false;
                }

                char left = stack.pop();

                if (!isMatching(left, ch)) {
                    System.out.println("錯誤：括號順序不正確，"
                            + left + " 無法與 " + ch + " 配對。");
                    return false;
                }
            }
        }

        if (!stack.isEmpty()) {
            System.out.println("錯誤：缺少右括號，未配對的左括號為："
                    + stack);
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== 括號驗證系統 =====");
        System.out.print("請輸入要驗證的文字：");
        String text = scanner.nextLine();

        if (validateBrackets(text)) {
            System.out.println("驗證結果：括號配對正確。");
        } else {
            System.out.println("驗證結果：括號配對錯誤。");
        }

        scanner.close();
    }
}