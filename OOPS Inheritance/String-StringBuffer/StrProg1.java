class StrProg1
{
	public static void main(String[] args)
	{
		String str="121";
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev + str.charAt(i);	
		}
		 if(str.equals(rev))
		{
			System.out.println("String is a palindrome");
		}
		else
		{
			System.out.println("String is not a palindrome");
		}
	}
}