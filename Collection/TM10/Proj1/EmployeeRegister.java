import java.util.ArrayList;
import java.util.*;

class EmployeeRegister 
{
	public static void main(String ar[])
	{
		String firstName,lastName,email,address,mobNo;

		ArrayList<String> alist= new ArrayList<String>();
		System.out.println("Register the Employees");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter First name of Employee");
		firstName=sc.next();
		alist.add(firstName);
		
		System.out.println("Enter 	Last name of Employee");
		lastName=sc.next();
		alist.add(lastName);
		
		System.out.println("Enter Email of Employee");
		email=sc.next();
		alist.add(email);
		
		System.out.println("Enter Address of Employee");
		address=sc.next();
		alist.add(address);
		
		System.out.println("Enter Mobile Number of Employee");
		mobNo=sc.next();
		alist.add(mobNo);
		
		
		Iterator itr = alist.iterator();
		System.out.println("\n\nTraversing forward:\n");
		while(itr.hasNext())
		{
			String item = (String)itr.next();
			System.out.println(item);
		}
		
	}


	
}