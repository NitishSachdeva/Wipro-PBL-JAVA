import java.util.*;

public class SetOfCards 
{
    public static void main(String[] args) 
	{
		String item1,item2,item3,item4;
		Scanner sc = new Scanner(System.in);
        List<String> initialList = new ArrayList<String>();
		
		System.out.println("Enter your item ");
		item1=sc.next();
		initialList.add(item1);
		
		System.out.println("Enter your item ");
		item2=sc.next();
		initialList.add(item2);
		
		System.out.println("Enter your item ");
		item3=sc.next();
		initialList.add(item3);
		
		System.out.println("Enter your item ");
		item4=sc.next();
		initialList.add(item4);
		
		
		System.out.printf("\nInitial list: %s%n", initialList);
        sortList(initialList);
    }
 
    public static void sortList (List<String> myList)
	{
        Set<String> hashsetList = new HashSet<String>(myList);
        System.out.printf("\nUnique values using HashSet: %s%n", hashsetList);
	}
}		