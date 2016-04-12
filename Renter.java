package tools_car_rental;

import java.sql.Date;
import java.util.Iterator;
import java.util.Scanner;

public class Renter implements Rentable
{
	@Override
	public boolean isAvailable(Car car)
	{
		if(!car.getStatus())
			return false;
		return true;
	}
	@Override
	public void rentCar() 
	{
		Scanner sc = new Scanner(System.in);
		Iterator<Car> it = DataBase.getListOfCars().iterator();
		int z =0;
		while (it.hasNext())
		{
			System.out.println(z + " ");
			System.out.println(it.next());
			++z;
		}
		System.out.println("\nGive number of car which you want to rent: ");
		int i = sc.nextInt();
		DataBase.getListOfCars().get(i).setStatus(false);
		adder.addLog(new Log());
	}
	private Adder adder = new Adder();
}
