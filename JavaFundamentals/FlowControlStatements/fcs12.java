class fcs12
{
	public static void main(String[] args)
	{
		int n=Integer.parseInt(args[0]);
		int temp=0;
		
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				temp=1;
			}	
		}
			if(temp==1)
			{
				System.out.println("Given number is not a prime number");
			}
			else
			{
				if(temp==0)
				{
					System.out.println("Given number is a prime number");
			    }
				else
				{
					System.out.println("Given number is not a prime number");
			    }
			}
	}
}	