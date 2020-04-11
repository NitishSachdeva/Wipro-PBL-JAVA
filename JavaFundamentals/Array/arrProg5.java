class arrProg5
{
	public static void main(String[] args)
	{
		int[] myList = {19, 29, 34, 35};

		java.util.Arrays.sort(myList);
        System.out.println("Two largest numbers: " + myList[myList.length - 1] + ", " + myList[myList.length - 2]);
        System.out.println("Two smallest numbers: " + myList[0] + ", " + myList[1]);
	}
}