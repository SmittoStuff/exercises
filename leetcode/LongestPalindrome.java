import java.lang.StringBuilder;

class LongestPalindrome {
    public static String longestPalindrome(String s) {
        String longestPalindrome = "";
        for(int i = 0; i < s.length(); i++) {
            for(int j = i + 1; j < s.length(); j++) {
                String newString = String.valueOf(s.charAt(0));
                for(int step = 0; step < ((j - i)/2 + 1); step++) {
                    
                    if(s.charAt(i+step) == s.charAt(j-step)) {
                        newString = newString + s.charAt(i+step);
                    }
                }
                String newPalindrome = "";
                if((j - i) % 2 != 0) {
                    String reverseString = new StringBuilder(newString).reverse().toString();
                    newPalindrome = newString + reverseString;
                } else if (newString.length() > 1) {
                    String reverseString = new StringBuilder(newString.substring(0, newString.length() - 1)).reverse().toString();
                    newPalindrome = newString + reverseString;
                } else {
                    newPalindrome = newString;
                }
                if(newPalindrome.length() > longestPalindrome.length()) {
                    longestPalindrome = newPalindrome;
                }
            }
        }
        return longestPalindrome;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("abba"));
        System.out.println(longestPalindrome("babad"));
        System.out.println(longestPalindrome("abcdcbafers"));
    }
}
