import java.util.*;
class Cn
{
	String countryName;
		Cn(String countryName)
		{
			this.countryName=countryName;
		}	
/*	public String saveCountryNames(String countryName)
	{
			
	}
 */
}
 
 
 class SetProg4
 {
	public static void main(String ar[])
	{
		
		Set<Cn> s= new TreeSet<Cn>();
		Cn c1=new Cn("India");
		Cn c2=new Cn("Australia");
	    Cn c3=new Cn("Spain");

		s.add(c1);
		s.add(c2);
		s.add(c3);
		
		for(Cn c:s)
		{  
			System.out.println(c.countryName + "\t");  
		}  	
			
	}
}