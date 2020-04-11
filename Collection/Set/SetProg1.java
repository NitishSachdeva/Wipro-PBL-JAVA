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
 
 
 class SetProg1
 {
	public static void main(String ar[])
	{
		
		Set<Cn> s= new HashSet<Cn>();
		Cn c1=new Cn("India");
		Cn c2=new Cn("Australia");
	
		s.add(c1);
		s.add(c2);
		
		for(Cn c:s)
		{  
			System.out.println(c.countryName + "\t");  
		}  	
			
	}
}