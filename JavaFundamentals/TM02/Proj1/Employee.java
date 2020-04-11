class Employee 
{
	private int empNo[] = {1001,1002,1003,1004,1005,1006,1007};
	private String empName[] = {"Ashish","Sushma","Rahul","Chahat","Ranjan","Suman","Tanmay"};
	private String joinDate[] = {"01/04/2009","23/08/2012","12/11/2008","29/01/2013","16/07/2005","1/1/2000","12/06/2006"};
	private char desgCode[] = {'e','c','k','r','m','e','c'};
	private String dept[] = {"R&D","PM","Acct","Front Desk","Engg","Manufacturing","PM"};
	private int basic[] = {20000,30000,10000,12000,50000,23000,29000};
	private int hra[] = {8000,12000,8000,6000,20000,9000,12000};
	private int it[] = {3000,9000,1000,2000,20000,4400,10000};
	private String desig = "";
	private int da = 0;

	int findEmp(int n) 
	{
		for (int i = 0;i < empNo.length;i++) 
		{
			if (n == empNo[i]) 
				return i;
		}
		return -1;
	}

	int salary(int index) 
	{
		return basic[index] + hra[index] + da - it[index];
	}

	void setDesig(int index) 
	{
		switch(desgCode[index])  
		{
			case 'e': 	da = 20000;
						desig = "Engineer";
						break;
			case 'c':	da = 32000;
						desig = "Consultant";
						break;
			case 'k': 	da = 12000;
						desig = "Clerk";
						break;
			case 'r': 	da = 15000;
						desig = "Receptionist";
						break;
			case 'm':	da = 40000;
						desig = "Manager";
						break;
		}
	}

	void printEmpDetails(int index) 
	{
		setDesig(index);
		System.out.println("Emp No. Emp Name  Department  Designation  Salary");
		/*System.out.println(empNo[index] + "\t" + empName[index] + "\t" + dept[index] + "\t" + desig + "\t" + salary(index));*/
        System.out.printf("%-7d %-9s %-11s %-12s %-10d \n", empNo[index], empName[index], dept[index], desig, salary(index));
	}

	public static void main(String[] args) 
	{
		Employee obj = new Employee();
	
		int empno = Integer.parseInt(args[0]);
		int index = obj.findEmp(empno);
		
		if (index < 0) 
		{
			System.out.println("There is no employee with empid: " + empno);
		}
		else obj.printEmpDetails(index);
	}
}