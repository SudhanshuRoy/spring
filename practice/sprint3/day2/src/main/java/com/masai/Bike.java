package com.masai;

public class Bike implements Vehical
{
	public void ride()
	{
		System.out.println("Ride starts ..");
	}

	@Override
	public void go() {
		ride();
		
	}

}
