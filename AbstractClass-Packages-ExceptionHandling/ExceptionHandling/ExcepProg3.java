import java.util.Scanner;
class ExcepProg3 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of elements in the array: ");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements in the array: ");
        for (int i = 0;i < n;i++) 
		{
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the index of the element you want to access: ");
        int a = 0;
        try 
		{
            a = Integer.parseInt(sc.next());
            System.out.println("The array element at index " + a + " = " + arr[a]);
            System.out.println("The array element successfully accessed");   
        }
        catch (ArrayIndexOutOfBoundsException e) 
		{
            System.out.println(e.getClass().getCanonicalName());
            return;
        }
        catch (NumberFormatException e) 
		{
            System.out.println(e.getClass().getCanonicalName());
            return;
        }
    }
}