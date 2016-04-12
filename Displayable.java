package tools_car_rental;

public interface Displayable 
{
	public void displayAvailableCars();
	public void displayClients();
	public boolean isCarAvailable(Car car);
	public void displayRentalHistory();
}
