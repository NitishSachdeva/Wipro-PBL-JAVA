import java.util.*;    
class CN
{    
	String Capital;
	String Countryname;       
	public CN(String Capital, String Countryname) 
	{    		
		this.Capital=Capital;
		this.Countryname=Countryname;       

	}    
}    
public class MapProg1 
{    
	public static void main(String[] args)
	{    
		//Creating map of Books    
		Map<Integer,CN> hm=new HashMap<Integer,CN>();    
		
		CN c1=new CN("Delhi","India");    
		CN c2=new CN("Tokyo","Japan");
		
		hm.put(1,c1);  
		hm.put(2,c2);  
		 
		 Iterator trav=hm.entrySet().iterator();
		  
		  while(trav.hasNext())
		   {
			  Map.Entry record=(Map.Entry)trav.next();  //will give next (Key, Value) pair
		 
			  System.out.println(record.getKey() + "\t"+ record.getValue());
		   }
		
	}    
}    