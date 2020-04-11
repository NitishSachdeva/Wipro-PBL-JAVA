class fcs6
{
	public static void main(String[] args)
	{
		String s1=args[0];
		int age=Integer.parseInt(args[1]);
		if(s1.equalsIgnoreCase("Female") && (age>=1 || age<=58))
		{
			System.out.println("Percentage of interest is 8.2%");
		}
		else if(s1.equalsIgnoreCase("Female") && (age>=59 || age<=100))
		{
			System.out.println("Percentage of interest is 9.2%");
		}
		else if(s1.equalsIgnoreCase("Male") && (age>=1 || age<=58))
		{
			System.out.println("Percentage of interest is 8.4%");
		}
		else if(s1.equalsIgnoreCase("Male") && (age>=59 || age<=100))
		{
			System.out.println("Percentage of interest is 10.5%");
		}
		
	}
}