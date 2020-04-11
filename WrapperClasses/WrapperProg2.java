class WrapperProg2
{
	public static void main(String[] args)
	{
		int i=Integer.parseInt(args[0]);
		System.out.println("In Binary \t " +  Integer.toBinaryString(i) );
		System.out.println("In Octal \t"  +  Integer.toOctalString(i) );
		System.out.println("In Hexa  \t"   +  Integer.toHexString(i) );
	}
}	