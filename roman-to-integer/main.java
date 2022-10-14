import java.util.Map;

class Main{
    static Map<Character, Integer> romanNumerals = Map.of(
        'I',1,
        'V',5,
        'X',10,
        'L',50,
        'C',100,
        'D',500,
        'M', 1000
        );
    public static void main(String[] args) {
        String s = "LVIII";
        System.out.println(romanToInt(s));
    }

    public static  int romanToInt(String s) {
        int output = 0;
        for (int i = 0; i < s.length(); i++) {
            if(i + 1 <s.length()){
                if(romanNumerals.get(s.charAt(i)) < romanNumerals.get(s.charAt(i+1))){
                    output += romanNumerals.get(s.charAt(i+1)) - romanNumerals.get(s.charAt(i));
                    i++;
                }else{
                    output+= romanNumerals.get(s.charAt(i));
                }
            }else{
                output += romanNumerals.get(s.charAt(i));
            }
                
        }
        return output;
    }
};