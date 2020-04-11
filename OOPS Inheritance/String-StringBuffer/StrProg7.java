class StrProg7
{
	public static void main(String[] args)
	{
		String str="xHix";
		if(str.length() >= 2) 
		{
			if(str.charAt(0) == 'x' && str.charAt(str.length()-1) == 'x') 
			{
				System.out.println(str.substring(1,str.length()-1));
			}
			else
			{
				System.out.println("String remain unchanged\t" + str);
			}
				
		}	
	}
}