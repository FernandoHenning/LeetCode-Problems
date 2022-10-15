import java.util.ArrayList;
import java.util.Arrays;

public class LCP {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println("Result: "+longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
        if(strs.length == 1) return strs[0];

        Arrays.sort(strs);
        int lastPos = strs.length - 1;
        int i = 0;
        String first = strs[0];
        String last = strs[lastPos];
        String prefix = "";

        if(!first.isBlank()){
            while (true) {
                if( i<first.length() && i <last.length()){
                    if(first.charAt(i) == last.charAt(i) ){
                        prefix += last.charAt(i);
                    }else break;
                    i++;
                }else{
                    return prefix;
                }
            }
        }
        return prefix;
    }
}