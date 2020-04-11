class StrProg6
{
	public static void main(String[] args)
	{
		String str1="Hi";
		String str2="Hello";
		
		if(str1.length()<str2.length())
		{
			System.out.print("\t"+(str1+str2+str2+str1));
		}
		else
		{
			System.out.print("Use first string of short length");
		}
	}
}