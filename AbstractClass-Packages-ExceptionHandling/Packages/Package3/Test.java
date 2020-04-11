import com.automobile.twowheeler.Hero;
import com.automobile.fourwheeler.Honda;

class Test 
{
    public static void main(String[] args) 
	{
        Hero h1 = new Hero();
    	h1.getModelName();
        h1.getRegistrationNumber();
        h1.getOwnerName();
        h1.getSpeed();
        System.out.println();;
		
		Honda h2=new Honda();
		h2.getModelName();
        h2.getRegistrationNumber();
        h2.getOwnerName();
        h2.getSpeed();
		h2.cdplayer();
    }
}