import java.util.*;
class Box 
{
	 
    public static void main(String[] args) 
	{
		int choice;
		
		double length,width,height;
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number of box");
		choice=sc.nextInt();
		List<Double> initialList = new ArrayList<Double>();
			
		for(int i=1;i<=choice;i++)
		{
			
			System.out.println("Enter Box length ");
			length=sc.nextDouble();
			initialList.add(length);
			
			System.out.println("Enter Box width ");
			width=sc.nextDouble();
			initialList.add(width);
			
			System.out.println("Enter Box height ");
			height=sc.nextDouble();
			initialList.add(height);
			
			System.out.printf("\nInitial list: %s%n", initialList);
			sortList(initialList);
	
		}
	
	}
	
	public static void sortList (List<Double> myList)
	{
        Set<Double> hashsetList = new HashSet<Double>(myList);
        System.out.printf("\nUnique values using HashSet: %s%n", hashsetList);
	}
	
}	
