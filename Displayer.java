package tools_car_rental;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Displayer implements Displayable
{
	@Override
	public void displayAvailableCars()
	{
		for(Car temp : DataBase.getListOfCars())
		{
			if(temp.getStatus())
				System.out.println(temp);
		}
	}
	@Override
	public void displayClients()
	{
		System.out.println(DataBase.getListOfClients());
	}
	@Override
	public void displayRentLogs()
	{
		for(Log tmp : DataBase.getListOfLogs())
		{
			System.out.print(tmp.toString());
		}
	}
	
}
