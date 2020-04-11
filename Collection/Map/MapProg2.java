import java.util.*;
 class MapProg2 
 {
	public static void main(String ar[])
	{
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		 
		   hm.put(17,"abhishek");
		 
		   hm.put(57,"anushka");
		 
		   hm.put(50,"nitish");
		 
		   hm.put(33,"aparna");
		   
		   boolean blnExists = hm.containsKey("33");
		   System.out.println("33 exists in HashMap ? : " + blnExists);
		 
		   Iterator trav=hm.entrySet().iterator();
		  
		  while(trav.hasNext())
		   {
			  Map.Entry record=(Map.Entry)trav.next();  //will give next (Key, Value) pair
		 
			  System.out.println(record.getKey()+ "\t"+ record.getValue());
		   }
	}
}