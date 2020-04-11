
package javaapplication1;
import java.util.ArrayList;
 class CustomType // extends java.lang.Object
{
	int a;
	float b;
	double d;

	CustomType(int a, float b,double d)
	{
		this.a=a;
		this.b=b;
		this.d=d;

	
	}

	// override toString() method of java.lang.Object class

	public String toString() // gets implicitly called when object of it's class is printed
	{
		return a + "\t" + b + "\t" + d + "\n";
	}
}



class ListProg4
{
	public static void main(String ar[])
	{
		ArrayList<CustomType> customList = new ArrayList<CustomType>();
			CustomType ct1 = new CustomType(1,99.99f,99.000);
	/*
			System.out.println(st1); // gets converted implicitly to: System.out.println(st1.toString());
	*/

			customList.add(ct1);
			

			System.out.println("Elements is Custom List");
			System.out.println(customList);
	}
}



