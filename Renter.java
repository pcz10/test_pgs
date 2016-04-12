package tools_car_rental;

import java.util.Iterator;
import java.util.Scanner;

public class Renter implements Rentable
{
	public Renter(DataBase controlVar)
	{
		this.controlVar = controlVar;
	}

	@Override
	public void rent() 
	{
		Scanner sc = new Scanner(System.in);
		Iterator<Car> it = controlVar.getListOfCars().iterator();
		int z =0;
		while (it.hasNext())
		{
			System.out.println(z + " ");
			System.out.println(it.next());
			++z;
		}
		System.out.println("\nGive number of car which you want to rent: ");
		int i = sc.nextInt();
		controlVar.getListOfCars().get(i).setStatus(false);
	}
	
	private DataBase controlVar;
}
