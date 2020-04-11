import java.util.*;
 class SetProg3 
 {
	public static void main(String ar[])
	{
		String itm="";
		Set<String> s= new TreeSet<String>();
		s.add("Nitish");
		s.add("Navdeep");
		s.add("Rahul");
		Iterator it=s.iterator();
		while(it.hasNext())
		{
			String item=(String)it.next();
			System.out.println(item+"\n");
			
		}
		
		if(itm.equals("Nitish"))
		{
			System.out.println("item found in treeset collection"+"\n");
		}
	}
}