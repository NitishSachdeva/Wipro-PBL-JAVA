package com.automobile.fourwheeler;
import com.automobile.Vehicle;

public class Logan extends Vehicle 
{
    public String getModelName() 
	{
        System.out.println("Model Name: Logan");
        return "Logan";
    }

    public String getRegistrationNumber() 
	{
        System.out.println("Regn No: PB26 KH 1801");
        return "PB26 KH 1801";
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

    public int gps() 
	{
        System.out.println("Controls GPS");
        return 1;
    }

    
}