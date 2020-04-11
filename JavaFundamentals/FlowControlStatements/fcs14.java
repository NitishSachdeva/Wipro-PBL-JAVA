class fcs14
{
	public static void main(String[] args)
	{
		int n=Integer.parseInt(args[0]);
		int temp=0;
		
		if (n == 1) 
		System.out.println( "1 is neither prime nor composite");
        	
		else if (n == 0) 
		System.out.println("0 is not a prime number");
        	
		else 	
		for(int i=2;i<=n-1;i++)
		{
			
			if(n%i==0)
				{
					temp=1;
				}
		}	
		
			if(temp==0)
			{
			  System.out.println("Given number is a prime number\t");
			}
			else
			{
			  System.out.println("Given number is not a prime number");
		    }
	}
}	