class Fruit
{
	String name;
	String taste;
	int size;
	public String eat(String n,String T)
	{
		this.name=n;
		this.taste=t;
		
	    System.out.println("Name of fruit is" +name +",taste of it is" +taste);
	}
}
/*class Apples extends Fruit
{
	
}
class Orange extends Fruit
{
	
}*/
class inherit4
{
	public static void main(String[] args)
	{
			Fruit f=new Fruit("grapes","sweet");
			/*Fruit f=new Apples();
			Fruit f=new Orange();*/
	}
}