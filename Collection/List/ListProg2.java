import java.util.ArrayList;
import java.util.Iterator;
 
class ListProg2 
 {
	public static void main(String ar[])
	{
		ArrayList<Employee> alist= new ArrayList<Employee>();
		
		Employee e1 = new Employee(1,"Navdeep","n@gmail.com","male",99000.00f);
		alist.add(e1);
		
		Iterator itr = alist.iterator();
		System.out.println("\n\nTraversing forward:\n");
		while(itr.hasNext())
		{
			Employee item = (Employee)itr.next();
			System.out.println(item);
		}
		
	}
}

class Employee // extends java.lang.Object
{
	int empid;
	String empname, email,gender;
	float salary;

	Employee(int r, String n,String em, String g, float s)
	{
		empid = r;
		empname = n;
		email = em;
		gender=g;
		salary = s;
	}

	// override toString() method of java.lang.Object class

	public String toString() // gets implicitly called when object of it's class is printed
	{
		return empid + "\t" + empname + "\t" + email + "\t" +gender + "\t" + salary + "\n";
	}
}