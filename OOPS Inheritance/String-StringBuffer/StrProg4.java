class StrProg4
{
	public static void main(String[] args)
	{
		String str="Tomcat";
		System.out.println("Orig string" + str);
				
		if(str.length()%2==0)
		{
			System.out.println("First half of  string\t" + str.substring(0, str.length()/2));
		}	
		else
		{
			System.out.println("null");
			return;
		}
	}
}	