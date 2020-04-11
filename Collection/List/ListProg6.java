import java.util.LinkedList;
 class ListProg6 
 {
	public static void main(String ar[])
	{
		LinkedList<String> linlist = new LinkedList<String>();
		linlist.addFirst("January");
		linlist.add("February");
		linlist.add("March");
		linlist.add("April");
		linlist.add("May");
		linlist.add("June");
		linlist.add("July");
		linlist.add("August");
		linlist.add("September");
		linlist.add("October");
		linlist.add("November");
		linlist.add("December");
		
		
		System.out.println("Elements in linked list are \t" + linlist);
		
	}
}
