class StrProg9 {
    public static void main(String[] args) {
        String a = "", b = "";
        try {
            a = args[0];
            b = args[1];
        }
        catch (Exception e) {
            System.out.println("Enter 2 string arguments");
        }
        int l = a.length() < b.length() ? a.length() : b.length();
        String temp = "";
        for (int i = 0;i < l;i++) {
            temp += Character.toString(a.charAt(i)) + Character.toString(b.charAt(i));
        }
        if (l == a.length()) temp += b.substring(l);
        else temp += a.substring(l);
        System.out.println(temp);
    }
}