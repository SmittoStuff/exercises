class PalindromeNumber {
  public static boolean isPalindrome1(int x) {
      String original = String.valueOf(x);
      String reversed = "";
      for (int i=(original.length() - 1); i >= 0; i--) {
          reversed = reversed + original.charAt(i);
      }
      return reversed.equals(original);
  }

  public static boolean isPalindrome2(int x){
    if(x < 0) return false; 
    int reversed = 0, original = x;
    while(x != 0) {
         reversed = reversed * 10 + x % 10;
         x  /= 10;
    }
     return original == reversed;
 }

  public static void main(String[] args) {
    System.out.println(isPalindrome1(121));
    System.out.println(isPalindrome2(-121));
  }
}