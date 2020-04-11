import java.util.ArrayList;
import java.util.Iterator;

public class ListProg3 
{
   	public static void main(String ar[])
	{
		ArrayList<String> alist = new ArrayList<String>();
		alist.add("January");
		alist.add("February");
		alist.add("March");
		alist.add("April");
		alist.add("May");
		alist.add("June");
		alist.add("July");
		alist.add("August");
		alist.add("September");
		alist.add("October");
		alist.add("November");
		alist.add("December");
		
		Iterator itr = alist.iterator();
		System.out.println("\n\nTraversing forward:\n");
		while(itr.hasNext())
		{
			String item = (String)itr.next();
			System.out.println(item);
		}
	}
}

