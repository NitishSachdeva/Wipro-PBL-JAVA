import java.util.*;
class Emp 
{
    public static void main(String[] args) 
	{
        int choice = 0;
        int id;
		String s;
		int age;
		int sal;
        Scanner sc = new Scanner(System.in);
        
        while(true) 
		{
            System.out.println("MAIN MENU");
            System.out.println("=========");
            System.out.println("1. Add an Employee");
            System.out.println("2. Display");
            System.out.println("3. Exit.");
            System.out.print("Enter your choice (1..3): ");
            choice = sc.nextInt();
            System.out.println();
            switch(choice) 
			{
                case 1:
                    System.out.print("Enter the Employee Detais: ");
                    System.out.print("Enter Employee id\t");
					id=sc.nextInt();
					System.out.print("Enter Employee name\t");
					s=sc.next();
					System.out.print("Enter Employee age\t");
					age=sc.nextInt();
					System.out.print("Enter Employee salary\t");
					sal=sc.nextInt();
                    System.out.println();
                    break;
				
				case 2:
                    System.out.println("Displaying...The Employees List!!!");
                    return;
				
				case 3:
                    System.out.println("Exiting...Thanks for using the application!!!");
                    return;
				
			}
		}
	}
}	
			