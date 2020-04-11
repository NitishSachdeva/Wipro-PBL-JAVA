import java.util.Random;

abstract class Compartment 
{
    public abstract void notice();
}

class FirstClass extends Compartment 
{
    public void notice() 
	{
        System.out.println("This is First Class compartment.");
    }
}

class Ladies extends Compartment 
{
    public void notice() 
	{
        System.out.println("This is Ladies compartment.");
    }
}

class General extends Compartment 
{
    public void notice() 
	{
        System.out.println("This is General compartment.");
    }
}

class Luggage extends Compartment 
{
    public void notice() 
	{
        System.out.println("This is Luggage compartment.");
    }
}

class TestCompartment 
{
    public static void main(String[] args) 
	{
        Compartment arr[] = new Compartment[10];
        Random rand = new Random();
        for (int i = 0;i < arr.length;i++) 
		{
            int choice = rand.nextInt(4) + 1;
            switch(choice) 
			{
                case 1:
                    arr[i] = new FirstClass();
                    break;
                case 2:
                    arr[i] = new Ladies();
                    break;
                case 3:
                    arr[i] = new General();
                    break;
                case 4:
                    arr[i] = new Luggage();
                    break;
            }
        }
        for (Compartment i:arr) 
		{
            i.notice();
        }
    }
}