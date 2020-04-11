class StrProg11 {
    public static void main(String[] args) {
        String s1 = "",s2 = "";
        try {
            s1 = args[0];
            s2 = args[1];
        }
        catch (Exception e) {
            System.out.println("Enter two strings");
        }
        String temp = "";
        int i = 0;
        while (i + s2.length() <= s1.length()) {
            String a = s1.substring(i, i + s2.length());
            if (a.equals(s2)) {
                temp += i - 1 >= 0 ? Character.toString(s1.charAt(i - 1)) : "";
                temp += i + 2 < s1.length() ? Character.toString(s1.charAt(i + 2)) : "";
            }
            i++;
        }
        System.out.println(temp);
    }
}