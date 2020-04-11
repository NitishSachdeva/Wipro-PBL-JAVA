class arrProg10 
{
	public static void main(String[] args) 
	{
		int myarr[][] = new int[3][3];
		if (args.length < 9) 
		{
			System.out.println("Please enter 9 integer numbers.");
			return;
		}
		int k = 0;
		for(int i = 0;i < 3;i++) for(int j = 0;j < 3;j++) myarr[i][j] = Integer.parseInt(args[k++]);
		System.out.print(myarr[0][0] + " ");
		System.out.print(myarr[0][1] + " ");
		System.out.println(myarr[0][2] );
		
		System.out.print(myarr[1][0] + " ");
		System.out.print(myarr[1][1] + " ");
		System.out.println(myarr[1][2] );

		System.out.print(myarr[2][0] + " ");
		System.out.print(myarr[2][1] + " ");
		System.out.println(myarr[2][2] );
		
				
		
	}
}