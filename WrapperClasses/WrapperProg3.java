import java.util.Scanner;
class WrapperProg3
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		int i=sc.nextInt();
		if(i>=1 && i<=256)
		{
			System.out.println("In Binary \t " +  Integer.toBinaryString(i) );
		}
		else 
		{
			System.out.println("Enter b/w 1 and 256");
			return;
		}
		
	}
}	