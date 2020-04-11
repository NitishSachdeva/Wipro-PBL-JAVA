import java.util.Scanner;
class ExcepProg1 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int a = 0;
        try 
		{
            a = Integer.parseInt(sc.next());
        }
        catch (NumberFormatException e) 
		{
            System.out.println("Entered input is not a valid format for an integer.");
            return;
        }
        System.out.println("The square value is " + (a*a));
        System.out.println("The work has been done successfully");
    }
}