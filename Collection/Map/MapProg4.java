import java.util.*; 
class MapProg4 
 {
	public static void main(String ar[])
	{
		Map<Integer,ContactList> hm= new HashMap<Integer,ContactList>();
		
		ContactList c1=new ContactList("Navdeep","9876543210");
		ContactList c2=new ContactList("Nitish","9876543210");
		hm.put(1,c1);
		hm.put(2,c2);
	
		Iterator trav=hm.entrySet().iterator();
		  
		  while(trav.hasNext())
		   {
			  Map.Entry record=(Map.Entry)trav.next();  //will give next (Key, Value) pair
		 
			  System.out.println(record.getKey() + "\t"+ record.getValue());
		   }
		
	}
}

class ContactList
{
	String name;
	String phoneno;
	ContactList(String name,String phoneno)
	{
		this.name=name;
		this.phoneno=phoneno;
	}	
	public String toString() // gets implicitly called when object of it's class is printed
	{
		return name + "\t" + phoneno + "\n";
	}
}	
