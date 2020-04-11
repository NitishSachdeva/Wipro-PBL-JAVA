package live;

import music.Playable;
import music.wind.Saxophone;
import music.string.Veena;

public class Test 
{
    public static void main(String[] args) 
	{
        Veena v = new Veena();
        v.play();
    
		Saxophone s = new Saxophone();
        s.play();
        
		Playable p1 = new Veena();
        p1.play();
        
		Playable p2 = new Saxophone();
        p2.play();
    }
}