import java.io.*;
class IOStreamProg1 
{
	public static void main(String ar[])
	{
		
		try
		{
			FileReader fr =new FileReader("D:\\WL\\IOStreams\\filter.txt");
			BufferedReader br = new BufferedReader(fr);
         
			String line ;
			int count=0;
            while((line = br.readLine()) != null)
			{
                for(int i = 0; i < line.length(); i++)
				{
                    if(line.charAt(i) == 'r')
					{
                        count++;
                    }
                }
            }
			System.out.println(count);
        } 
		catch (IOException x)
		{
            System.err.println(x);
        }
                
	//	data.close();  
	}
}	