import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class VP {
    public static void main(String[] args) {
        String s = "((";
        System.out.println(isValid(s));
    }

    public static  boolean isValid(String s) {
        Stack<Character> leftSymbols = new Stack<>();
        List<Character> openSymbols =  Arrays.asList('(','[','{');
        if(s.length()>1){
            for (Character ch : s.toCharArray()) {   
                if(openSymbols.contains(ch)){
                    leftSymbols.add(ch);
                }else{
                    switch (ch) {
                        case ')':
                            if(!leftSymbols.isEmpty() && leftSymbols.peek() == '('){
                                 leftSymbols.pop();
                            }else{return false;}
                            break;
                        case ']':
                            if(!leftSymbols.isEmpty() && leftSymbols.peek() == '[') {
                                leftSymbols.pop();
                            }else{return false;}
                            break;
                        case '}':
                            if(!leftSymbols.isEmpty() && leftSymbols.peek() == '{') {
                                leftSymbols.pop();
                            }else{return false;}
                            break;
                        default:
                            return false;
                    }
                }
    
            }
        }else return false;

        return leftSymbols.isEmpty();
    }
}
