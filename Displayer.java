package tools_car_rental;

public class Displayer implements Displayable
{
	public Displayer(DataBase controlVar)
	{
		this.controlVar = controlVar;
	}
	@Override
	public void displayAvailableCars()
	{
		for(Car temp : controlVar.getListOfCars())
		{
			if(this.isCarAvailable(temp))
				System.out.println(temp);
		}
	}
	@Override
	public boolean isCarAvailable(Car car)
	{
		return car.getStatus();
	}
	@Override
	public void displayClients()
	{
		System.out.println(controlVar.getListOfClients());
	}
	@Override
	public void displayRentalHistory()
	{
		System.out.println(controlVar.getListOfRentalHistory());
	}
	private DataBase controlVar;
}
