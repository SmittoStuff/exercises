class StringIsUnique {
    public static boolean StringIsUnique(String s) {
        boolean[] chars = new boolean[128];
        for (int i = 0; i < s.length(); i++) {
            int val = s.charAt(i);
            if (chars[val]) {
                return false;
            }
            chars[val] = true;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(StringIsUnique("abcdef"));
        System.out.println(StringIsUnique("rabbleplabble"));
    }
}