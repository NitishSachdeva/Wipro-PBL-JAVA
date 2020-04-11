import java.util.Scanner;
class arrProg3
{
	public static void main(String[] args)
	{
		int[] myList = {19, 29, 34, 35};
        for (int i = 0; i < myList.length; i++) 
		{
          System.out.println(myList[i] + " ");
        }
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Element to be searched");
		int srch=scan.nextInt();
		boolean flag=false;
		for (int i = 0; i < myList.length; i++) 
		{
		   if(srch==myList[i])
		    {	
              System.out.println( "Element is present at index value\t " + i);
			  flag=true;
			  break;
		    }
		}	
			
			if(flag==false)
			{
				System.out.println(-1);
			}
        
		
	}
}