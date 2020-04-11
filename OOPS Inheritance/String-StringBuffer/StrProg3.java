class StrProg3
{
	public static void main(String[] args)
	{
		String str="Wipro";
		System.out.println("Orig string" + str);
		
		int len = str.length();
		
		String temp = str.substring(len-5, len-3);
		System.out.println("Copies of 2 characters of string\t" + (temp + temp + temp));
	}
}	