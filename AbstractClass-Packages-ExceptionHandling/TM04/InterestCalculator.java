import java.util.Scanner;
class InterestCalculator 
{
    public static void main(String[] args) 
	{
        int choice = 0;
        String s;
		
        Scanner sc = new Scanner(System.in);
        
        while(true) 
		{
            System.out.println("MAIN MENU");
            System.out.println("=========");
            System.out.println("1. Interest Calculator -\tSB ");
            System.out.println("2. Interest Calculator -\tFD");
            System.out.println("3. Interest Calculator -\tRD");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1..4): ");
            choice = sc.nextInt();
            System.out.println();
            switch(choice) 
			{
                case 1:
                    System.out.print("Enter the Employee Detais: ");
                    
                    System.out.println();
                    break;
				
				case 2:
                    
				case 3:
				
				case 4:
                    System.out.println("Exiting...Thanks for using the application!!!");
                    return;
				
			}
		}
	}
}	
			