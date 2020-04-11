class arrProg2
{
	public static void main(String[] args)
	{
		int[] myList = {19, 29, 34, 35};

     
        for (int i = 0; i < myList.length; i++) 
		{
          System.out.println(myList[i] + " ");
        }
		int max = myList[0];
        for (int i = 1; i < myList.length; i++) 
		{
			if (myList[i] > max) 
			{
				 max = myList[i];
			}
        }
			System.out.println("Max is " + max);
		int min = myList[0];
        for (int i = 1; i < myList.length; i++) 
		{
			if (myList[i] < min) 
			{
				 min = myList[i];
			}
        }
        System.out.println("Min is " + min);	
   }
}
	
     