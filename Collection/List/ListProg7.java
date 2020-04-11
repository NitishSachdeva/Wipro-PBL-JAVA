import java.util.Vector;
import java.util.Enumeration;
 class ListProg7 
 {
	public static void main(String ar[])
	{
		Vector<Employee> v= new Vector<Employee>();
		
		Employee e1 = new Employee(1,"Navdeep","Jalandhar",99000.00f);
		v.addElement(e1);
		
		Enumeration<Employee> en= v.elements();
		while(en.hasMoreElements())
		{
			System.out.println(en.nextElement()+"\n");
		}
	}
}

class Employee // extends java.lang.Object
{
	int empno;
	String name, address;
	float salary;

	Employee(int r, String n, String ad, float s)
	{
		empno = r;
		name = n;
		address = ad;
		salary = s;
	}

	// override toString() method of java.lang.Object class

	public String toString() // gets implicitly called when object of it's class is printed
	{
		return empno + "\t" + name + "\t" + address + "\t" + salary + "\n";
	}
}