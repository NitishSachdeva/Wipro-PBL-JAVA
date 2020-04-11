class fcs7
{
	public static void main(String[] args)
	{
		char ch=args[0].charAt(0);
		
			
			if (Character.isUpperCase(ch))
			{
			    System.out.println(ch + "->" + Character.toLowerCase(ch));
			}                        
			else
			{
		            System.out.println(ch + "->" + Character.toUpperCase(ch));
			}

		
		
	}
}