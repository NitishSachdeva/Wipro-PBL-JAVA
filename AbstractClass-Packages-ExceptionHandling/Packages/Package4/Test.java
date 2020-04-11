import com.automobile.fourwheeler.Logan;
import com.automobile.fourwheeler.Ford;

class Test 
{
    public static void main(String[] args) 
	{
        Logan l = new Logan();
        l.getModelName();
        l.getRegistrationNumber();
        l.getOwnerName();
        l.speed();
        l.gps();
        
		System.out.println();
		Ford f=new Ford();
		f.getModelName();
        f.getRegistrationNumber();
        f.getOwnerName();
        f.speed();
        f.tempControl();
	
	
	}
}