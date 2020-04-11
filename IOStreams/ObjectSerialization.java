import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class ObjectSerialization
{
	public static void main(String ar[]) throws IOException
	{
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\WL\\IOStreams\\DataSerialized.txt"));
		Employee st = new Employee("Puneet Sharma","Engineer",9999.00);
		oos.writeObject(st);
		System.out.println("Data serialized into file");
	}
}
 class Employee implements java.io.Serializable
{
	String name;
	String designation;
	double salary;
	Employee(String n,String d, double s)
	{
		name = n;
		designation=d;
		salary=s;
	}
	
	public String toString()
	{
		return  name +"\t" +designation +"\t" + salary;
	}
}