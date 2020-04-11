class fcs13
{
	public static void main(String[] args)
	{
		int temp=0;
		
		for(int i=10;i<=99;i++)
		{
			for(int j=1;i<i-1;j++)
			{	
				if(i%j==0)
				{
					temp=1;
				}
			}	
		
				if(temp==0)
				{
					System.out.println("Given number is a prime number\t"+i);
			    }
				else
				{
					System.out.println("Given number is not a prime number");
			    }
		}
	}
}	