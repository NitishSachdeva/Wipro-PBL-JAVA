class arrProg1
{
	public static void main(String[] args)
	{
		int[] myList = {19, 29, 34, 35};


        for (int i = 0; i < myList.length; i++) 
		{
          System.out.println(myList[i] + " ");
        }
     
     
		  int sum = 0;
		  int avg=0;
		  for (int i = 0; i < myList.length; i++)
		{
			sum += myList[i];
			avg  =sum/myList.length;
		}
		  System.out.println("Sum is " + sum);
		  System.out.println("Average is " + avg);

	}
}