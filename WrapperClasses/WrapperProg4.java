class Employee implements Cloneable
{  
	int rollno;  
	String name;  
  
	Employee(int rollno,String name)
	{  
	this.rollno=rollno;  
	this.name=name;  
	}  
  
	public Object clone()throws CloneNotSupportedException
	{  
	return super.clone();  
	}
}
class WrapperProg4
{	
  
	public static void main(String args[])
	{  
		try
		{  
			Employee s1=new Employee(101,"amit");  
			  
			Employee s2=(Employee)s1.clone();  
			  
			System.out.println("Original properties : " + s1.rollno + " " + s1.name);  
			System.out.println("cloning original properties : " + s2.rollno + " " + s2.name);
			
			s1.rollno=102;
			s1.name="Sumit";
			System.out.println("Original properties changed : " + s1.rollno + " " + s1.name);  
			System.out.println("cloning properties : " + s2.rollno + " " + s2.name);
		  
		}catch(CloneNotSupportedException c){}  
	  
	}  
}