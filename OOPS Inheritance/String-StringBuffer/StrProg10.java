class StrProg10
{
	public static void main(String[] args)
	{
		String str="Wipro";
		System.out.println("Orig string\t" + str);
		
		int len = str.length();
		
		String temp = str.substring(len-3, len);
		System.out.println("Copies of 2 characters of string\t" + (temp + temp + temp));
	}
}	