import java.lang.*;
class calculator
{
	public static void powerInt(int num1,int num2)
	{
		System.out.println("Integer power result is" +Math.pow(num1,num2));
	}
	public static void powerDouble(double num1,double num2)
	{
	
		System.out.println("Double power result is"+ Math.pow(num1,num2));
		
	}
}
class clsObj2
{   
	public static void main(String[] args)
	{
		calculator.powerInt(2,2);
		calculator.powerDouble(3.0,3.0);
	
	}
}