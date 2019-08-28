import java.util.Arrays;

class CheckPermutation {
    public static boolean CheckPermutation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        int[] s1_set = new int[128];
        int[] s2_set = new int[128];
        for (int i = 0; i < s1.length(); i++) {
            char val1 = s1.charAt(i);
            s1_set[i] += 1;
            char val2 = s2.charAt(i);
            s2_set[i] += 1;
        }
        
        if (Arrays.equals(s1_set, s2_set)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(CheckPermutation("blargle", "largble"));
        System.out.println(CheckPermutation("swag", "beast"));
    }
}