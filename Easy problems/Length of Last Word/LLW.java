import java.util.Arrays;
import java.util.StringTokenizer;

public class LLW {
    public static void main(String[] args) {
        String s =  "luffy is still joyboy";
        System.out.println(lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        String[] words = s.trim().split(" ");
        return words[words.length - 1].length();
    }

}
