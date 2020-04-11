import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
 
public class MyObjectFileStore 
{
 
    public void storeObject(Employee emp)
	{
         
        OutputStream ops = null;
        ObjectOutputStream objOps = null;
        try 
		{
            ops = new FileOutputStream("D:\\WL\\IOStreams\\TM07\\MyEmpFile.txt");
            objOps = new ObjectOutputStream(ops);
            objOps.writeObject(emp);
            objOps.flush();
        } 
		catch (FileNotFoundException e) 
		{
            e.printStackTrace();
        }
		catch (IOException e) 
		{
            e.printStackTrace();
        }
		finally
		{
            try
			{
                if(objOps != null) objOps.close();
            } 
			catch (Exception ex)
			{
                 
            }
        }
         
    }
     
    public void displayObjects()
	{
        InputStream fileIs = null;
        ObjectInputStream objIs = null;
        try 
		{
            fileIs = new FileInputStream("D:\\WL\\IOStreams\\TM07\\MyEmpFile.txt");
            objIs = new ObjectInputStream(fileIs);
            Employee emp = (Employee) objIs.readObject();
            System.out.println(emp);
        } 
		catch (FileNotFoundException e) 
		{
            e.printStackTrace();
        }
		catch (IOException e) 
		{
            e.printStackTrace();
        } 
		catch (ClassNotFoundException e)
		{
            e.printStackTrace();
        }
		finally 
		{
            try 
			{
                if(objIs != null) objIs.close();
            } 
			catch (Exception ex)
			{
                 
            }
        }
         
    }
     
    public static void main(String a[])
	{
    		
        int choice=0;
		MyObjectFileStore mof = new MyObjectFileStore();
       
            System.out.println("MAIN MENU");
            System.out.println("=========");
            System.out.println("1. Add an Employee");
            System.out.println("2. Display");
            System.out.println("3. Exit.");
            System.out.print("Enter your choice (1..3): ");
            System.out.println();
            while(true)
			{	
			switch(choice) 
			{
                case 1:
					
					Employee e1 = new Employee(101,"Tony",21,"20000");
					mof.storeObject(e1);
					System.out.println();
                    break;
				
				case 2:
                    System.out.println("Displaying...The Employees List!!!");
					mof.displayObjects();
                    return;
				
				case 3:
                    System.out.println("Exiting...Thanks for using the application!!!");
                    return;
				
			}
			}
    }
}
 
class Employee implements Serializable
{  
    private int id;
	private String name;
	private int age;
    private String salary;
     
    public Employee(int id,String name,int age , String salary)
	{
        this.id = id;
		this.name = name;
        this.age=age;
        this.salary = salary;
    }
     
    public String toString()
	{
        return id + "==" + name + "==" + age + "==" + salary;
    }
 
    
	public int getId() 
	{
        return id;
    }
 
    public void setId(int id) 
	{
        this.id = id;
    }
 
	
	public String getName() 
	{
        return name;
    }
 
    public void setName(String name) 
	{
        this.name = name;
    }
 
    public int getAge()
	{
        return age;
    }
 
    public void setAge(int age) 
	{
        this.age = age;
    }
 
    public String getSalary() 
	{
        return salary;
    }
 
    public void setSalary(String salary) 
	{
        this.salary = salary;
    }
}