class fcs5
{
	public static void main(String[] args)
	{
		char var1=args[0].charAt(0);;
		
		if((var1>=65 && var1<=90)|| (var1>=97 && var1<=122))
		{
			System.out.println("Alphabet");
		}
		else if(var1>=65 && var1<=90)
		{
			System.out.println("Digit");
		}
		else
		{
			System.out.println("Special Character");
		}
	}
}
