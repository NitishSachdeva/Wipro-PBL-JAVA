import java.util.*;
 class SetProg2 
 {
	public static void main(String ar[])
	{
		Set<String> s= new HashSet<String>();
		s.add("Nitish");
		s.add("Navdeep");
		s.add("Rahul");
		Iterator it=s.iterator();
		while(it.hasNext())
		{
			String item=(String)it.next();
			System.out.println(item+"\n");
		}
	}
}