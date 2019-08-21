import java.util.Map;
import java.util.HashMap;

class RomanToInteger {
    public static int romanToInt(String s) {
        Map<Character, Integer> romanVals = new HashMap<Character, Integer>();
        romanVals.put('I', 1);
        romanVals.put('V', 5);
        romanVals.put('X', 10);
        romanVals.put('L', 50);
        romanVals.put('C', 100);
        romanVals.put('D', 500);
        romanVals.put('M', 1000);
        
        int finalVal = 0;
        
        for (int i = s.length() - 1; i >= 0; i--) {
            if (i < s.length() - 1 && romanVals.get(s.charAt(i)) < romanVals.get(s.charAt(i+1))) {
                finalVal -= romanVals.get(s.charAt(i));
            } else {
                finalVal += romanVals.get(s.charAt(i));
            }
        }
        return finalVal;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("IV"));
        System.out.println(romanToInt("IX"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));
    }
}