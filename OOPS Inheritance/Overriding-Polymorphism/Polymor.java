class Shape
{
	public void draw()
	{
		System.out.println("Drawing shape");
	}
	public void erase()
	{
		System.out.println("Erasing shape");
	}
}
class Circle extends Shape
{
	public void draw()
	{
		System.out.println("Drawing circle");
	}
	public void erase()
	{
		System.out.println("Erasing circle");
	}
}

class Triangle extends Shape
{
	public void draw()
	{
		System.out.println("Drawing triangle");
	}
	public void erase()
	{
		System.out.println("Erasing triangle");
	}
}

class Square extends Shape
{
	public void draw()
	{
		System.out.println("Drawing square");
	}
	public void erase()
	{
		System.out.println("Erasing square");
	}
}
class Polymor
{
	public static void main(String[] args)
	{
		Shape c=new Circle();
		c.draw();
		c.erase();
		
		Shape t=new Triangle();
		t.draw();
		t.erase();
		
		Shape s=new Square();
		s.draw();
		s.erase();
	}	
}	