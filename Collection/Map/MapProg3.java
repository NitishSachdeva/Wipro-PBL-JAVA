import java.util.*;
 class MapProg3 
 {
	public static void main(String ar[])
	{
		HashMap<String, String> hm=new HashMap<String, String>();
		 
		   hm.put("Punjab","Delhi");
		 
		   hm.put("UP","Delhi");
		 
		   hm.put("Karnatka","Delhi");
		
		   Iterator trav=hm.entrySet().iterator();
		  
		  while(trav.hasNext())
		   {
			  Map.Entry record=(Map.Entry)trav.next();  //will give next (Key, Value) pair
		 
			  System.out.println(record.getKey() + "\t"+ record.getValue());
		   }
	}
}