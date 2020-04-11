import java.util.*;

public class SumOfCards 
{
    public static void main(String[] args) 
	{
		int sum=0;
		String item1,item2,item3,item4;
		int key1,key2,key3,key4;
		Scanner sc = new Scanner(System.in);
        Map<String,Integer> initialList = new HashMap<String,Integer>();
		
		System.out.println("Enter your item ");
		item1=sc.next();
		key1=sc.nextInt();
		initialList.put(item1,key1);
		
		System.out.println("Enter your item ");
		item2=sc.next();
		key2=sc.nextInt();
		initialList.put(item2,key2);
		
		System.out.println("Enter your item ");
		item3=sc.next();
		key3=sc.nextInt();
		initialList.put(item3,key3);
		
		System.out.println("Enter your item ");
		item4=sc.next();
		key4=sc.nextInt();
		initialList.put(item4,key4);

		
		Iterator trav=initialList.entrySet().iterator();
		  
		 while(trav.hasNext())
		 {
		
			Map.Entry record=(Map.Entry)trav.next();  //will give next (Key, Value) pair
			System.out.println("Unique cards are");
			System.out.println(record.getKey()+ "\t"+ record.getValue());
			
			/*sum=sum + record.getValue();
			System.out.println("Sum is " + sum );
			*/
		}
        
    }
 
}		