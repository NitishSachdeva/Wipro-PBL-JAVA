class ExcepProg4 
{
    public static void main(String[] args) 
	{
        if (args.length < 5) 
		{
            System.out.println("Enter atleast five integer arguments!");
            return;
        }
        int sum = 0;
        
		try 
		{
            for (String i:args) 
			{
                sum += Integer.parseInt(i);
            }   
        }
        catch (Exception e) 
		{
            System.out.println(e.getClass().getCanonicalName());
            return;
        }
        
		System.out.println("Sum = " + sum);
        System.out.println("Average = " + (sum/args.length));
    }
}