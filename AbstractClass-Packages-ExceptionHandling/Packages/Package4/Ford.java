package com.automobile.fourwheeler;
import com.automobile.Vehicle;

public class Ford extends Vehicle 
{
    public String getModelName() 
	{
        System.out.println("Model Name: Ford");
        return "Figo";
    }

    public String getRegistrationNumber() 
	{
        System.out.println("Regn No: PB02 BC 1801");
        return "PB02 BC 1801";
    }

    public String getOwnerName() 
	{
        System.out.println("Owner: Nitish Sachdeva");
        return "Nitish Sachdeva";
    }

    public int speed() 
	{
        System.out.println("Speed: 50 kmph");
        return 50;
    }
	
    public int tempControl() 
	{
        System.out.println("Controls for air conditioning");
        return 1;
    }
}