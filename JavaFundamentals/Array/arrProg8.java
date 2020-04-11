class arrProg8 
{
	int linSrch(int arr[], int key) 
	{
		int index = -1;
		for (int i = 0;i < arr.length;i++)
		{
			if (key == arr[i]) 
			{
				index = i;
				break;
			}
		}
		return index;
	}

    public static void main(String[] args) 
	{
        int arr[] = {1,6,4,7,9};
        arrProg8 obj = new arrProg8();
        int index1 =  obj.linSrch(arr,6);
		int index2 = obj.linSrch(arr, 7);
        if (index1 < index2) 
		{
        	for (int i = index1;i <= index2;i++) 
			arr[i] = 0;
        }
    	int sum = 0;
    	for (int i:arr) 
		sum += i;
    	System.out.println(sum);
    }
}