import java.util.*;
class arrProg7
{
	public static void main(String[] args)
	{
		int[] myList = {29, 9, 18, 2,9,29,6,4};

        for (int i = 0; i < myList.length; i++) 
		{
          System.out.println(myList[i] + " ");
        }
		
		Set<Integer> set = new HashSet<Integer>();
        for (int j:myList) set.add(j);
        Iterator it = set.iterator();
        while (it.hasNext()) System.out.print(it.next() + " ");
        System.out.println();
	}
}	