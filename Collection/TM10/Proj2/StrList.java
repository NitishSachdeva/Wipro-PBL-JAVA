import java.util.*;
class StrList 
{
    public static void main(String[] args) 
	{
        int choice = 0; 
		String item="";
		String search="";
		Scanner sc = new Scanner(System.in);
		List<String> alist= new ArrayList<String>();
        while(true) 
		{
            System.out.println("MAIN MENU");
            System.out.println("=========");
            System.out.println("1. Insert");
            System.out.println("2. Search");
			System.out.println("3. Delete");
			System.out.println("4. Display");
            System.out.println("5. Exit.");
            System.out.print("Enter your choice (1..3): ");
            choice = sc.nextInt();
            System.out.println();
            switch(choice) 
			{
                case 1:
						System.out.println("Enter your item in the List!!!")
						item=sc.next();
						alist.add(item);
						break;
				
				case 2:
                    System.out.println("Search your item in the List!!!");
                    search=sc.next();
					if(search.equals(alist))
					{
						System.out.println("Item present in the list");	
					}
					else
					{
						System.out.println("Item is not present in the list");
					}
					break;
					
				case 3:
					System.out.println("Deleting Item from the list");
					item=sc.next();
					alist.remove(item);
					break;	
					
				case 4:
					Iterator itr = alist.iterator();
					System.out.println("\n\nTraversing forward:\n");
					while(itr.hasNext())
					{
						String itm = (String)itr.next();
						System.out.println(itm);
					}
					break;
				
				case 5:
                    System.out.println("Exiting...Thanks for using the application!!!");
                    return;		
						
			}
		}
	
	}
}	
	
	
		