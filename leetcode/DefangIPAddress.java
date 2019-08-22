class DefangIPAddress {
    public static String defangIPaddr(String address) {
        int x = 0;
        while (x < address.length()) {
            char currChar = address.charAt(x);
            if (currChar == '.') {
                address = address.substring(0,x) + "[.]" + address.substring(x+1);
                x+=3;
            } else {
                x++;
            }
        }
        return address;
    }

    public static void main(String[] args) {
        System.out.println(defangIPaddr("1.1.1.1"));
        System.out.println(defangIPaddr("255.100.50.0"));
    }
}