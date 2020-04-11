package com.automobile.fourwheeler;

import com.automobile.Vehicle;

public class Honda extends Vehicle 
{
    public String getModelName() 
	{
        System.out.println("Model Name: Honda");
        return "Amaze";
    }

    public String getRegistrationNumber() 
	{
        System.out.println("Regn No: PB08 CD 1801");
        return "PB08 CD 1801";
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
	
    public void cdplayer() 
	{
        System.out.println("Controls for CD Player");
    }
}