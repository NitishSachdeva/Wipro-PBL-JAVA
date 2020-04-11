package com.automobile.twowheeler;

import com.automobile.Vehicle;

public class Hero extends Vehicle 
{
    public String getModelName() 
	{
        System.out.println("Model Name: Hero");
        return "Splendor";
    }

    public String getRegistrationNumber() 
	{
        System.out.println("RegNo: PB08 CD 5449");
        return "PB08 CD 5449";
    }

    public String getOwnerName() 
	{
        System.out.println("Owner: Nitish Sachdeva");
        return "Nitish Sachdeva";
    }

    public void radio() 
	{
        System.out.println("Controls for Radio");
    }

    public int getSpeed() 
	{
        System.out.println("Speed: 60 kmph");
        return 60;
    }

}