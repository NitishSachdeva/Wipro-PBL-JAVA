class arrProg9 
{
	public static void main(String[] args) 
	{
		int myarr[][] = new int[2][2];
		if (args.length < 4) 
		{
			System.out.println("Please enter 4 integer numbers.");
			return;
		}
		int k = 0;
		for(int i = 0;i < 2;i++) for(int j = 0;j < 2;j++) myarr[i][j] = Integer.parseInt(args[k++]);
		System.out.print(myarr[1][1] + " ");
		System.out.println(myarr[1][0]);
		System.out.print(myarr[0][1] + " ");
		System.out.println(myarr[0][0]);
	}
}