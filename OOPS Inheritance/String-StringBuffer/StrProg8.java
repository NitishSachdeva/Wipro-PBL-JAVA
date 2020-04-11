class StrProg8 
{
    public static void main(String[] args) 
	{
        String s = "";
        try {
            s = args[0];
        }
        catch(Exception e) {
            System.out.println("Enter a string");
        }
        int a = s.indexOf('*'),b = s.lastIndexOf('*');
        String temp = s.substring(a-1, b + 2);
        s = s.replace(temp, "");
        System.out.println(s);
    }
}