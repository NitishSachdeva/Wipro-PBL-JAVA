import java.util.Vector;
import java.util.Enumeration;
 class ListProg5 
 {
	public static void main(String ar[])
	{
		Vector<String> v= new Vector<String>();
		v.addElement("January");
		v.addElement("February");
		v.addElement("March");
		v.addElement("April");
		v.addElement("May");
		v.addElement("June");
		v.addElement("July");
		v.addElement("August");
		v.addElement("September");
		v.addElement("October");
		v.addElement("November");
		v.addElement("December");
	
		Enumeration<String> en= v.elements();
		while(en.hasMoreElements())
		{
			System.out.println(en.nextElement()+"\n");
		}
	}

}
