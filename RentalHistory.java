package tools_car_rental;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RentalHistory 
{
	public RentalHistory(Car car)
	{
		this.car = car;
		Date date = new Date();
		this.date = date;
	}
	
	@Override
	public String toString() {
		return " \n" + (counter++) + " RentalHistory [rental date = " + getRentalTime(date) + ", rented car = " + car + "]\n";
	}

	private String getRentalTime(Date date)
	{
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		return dateFormat.format(date);
	}
	private static int counter = 1;
	private Date date;
	private Car car;
}