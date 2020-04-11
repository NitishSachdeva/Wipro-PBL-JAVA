public class Emp extends Person 
{  
	private double salary;  
	private int yr_wrk;  
	private String insu_no;  
	  
	
	public Emp(String name,double sal,int yrwrk,String num)
	{		
		super(name);
		salary=sal;
		yr_wrk=yrwrk;
		insu_no=num;
	}
	public double getSalary()
	{	
		System.out.println("Annual salary is \t"+salary);
		return salary;  
	} 
	public int getYRStr()
	{		
		System.out.println("Year employee started to work\t"+yr_wrk);
		return yr_wrk;  
	} 
	public String getINSNo()
	{		
		System.out.println("Insurance no. is\t"+insu_no);
		return insu_no;
		
	} 	
	
}  