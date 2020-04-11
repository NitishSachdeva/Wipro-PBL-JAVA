class ExcepProg5 
{
    public double divide(int a, int b) throws ArithmeticException 
	{
        return a/b;
    }

    public static void main(String[] args) 
	{
        if (args.length <= 0) 
		{
            System.out.println("Enter integer arguments!");
            return;
        }
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        try 
		{
            System.out.println("The quotient is: " + new ExcepProg5().divide(a,b));
        }
        catch (ArithmeticException e) 
		{
            System.out.println(e.getClass().getCanonicalName());
            return;
        }
    }
}