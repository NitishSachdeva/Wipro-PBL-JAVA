public class Person
{
	private String name;
	public Person(String n)
	{
		name=n;
	}
	public String getName()
	{
		System.out.println("Name is\t"+name);
		return name;
	}

}