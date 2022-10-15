public class VP {
    public static void main(String[] args) {
        String s = "(]";
        System.out.println(isValid(s));
    }

    public static  boolean isValid(String s) {
        long openParenthesesCount = s.chars().filter(ch -> ch == '(').count();
        long closeParenthesesCount = s.chars().filter(ch -> ch == ')').count();

        long openSquareBracketsCount = s.chars().filter(ch -> ch == '[').count();
        long closeSquareBracketsCount = s.chars().filter(ch -> ch == ']').count();

        long openBracesCount = s.chars().filter(ch -> ch == '[').count();
        long closeBracesCount = s.chars().filter(ch -> ch == ']').count();

        return openParenthesesCount == closeParenthesesCount && openSquareBracketsCount == closeSquareBracketsCount && openBracesCount == closeBracesCount;
    }
}
