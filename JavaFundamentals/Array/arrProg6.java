class arrProg6
{
	public static void main(String[] args)
	{
		int[] myList = {29, 9, 18, 2};

        for (int i = 0; i < myList.length; i++) 
		{
          System.out.println(myList[i] + " ");
        }
		int temp=0;
		for (int i = 0; i < myList.length-1; i++) 
		{
			for (int j = 0; j < myList.length-1-i; j++)			
		    {
				if(myList[j]>myList[j+1])
				{
				   temp=myList[j];
				   myList[j]=myList[j+1];
				   myList[j+1]=temp;  
				}
			}
		}
		 for (int i = 0; i < myList.length; i++) 
				{
				  System.out.println(myList[i] + "\tarray is sorted ");
				}
    }
}				