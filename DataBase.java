package tools_car_rental;

import java.util.LinkedList;
import java.util.List;

public class DataBase 
{
	public void addCar(Car car)
	{
		this.listOfCars.add(car);
	}
	public void addClient(Client client)
	{
		this.listOfClients.add(client);
	}
	public void addRentalHistory(RentalHistory rentalHistory)
	{
		this.listOfRentalHistory.add(rentalHistory);
	}
	
	public List<Car> getListOfCars() 
	{
		return listOfCars;
	}
	public List<Client> getListOfClients() 
	{
		return listOfClients;
	}
	public List<RentalHistory> getListOfRentalHistory()
	{
		return listOfRentalHistory;
	}
	
	private List<Car> listOfCars = new LinkedList<>();
	private List<Client> listOfClients = new LinkedList<>();
	private List<RentalHistory> listOfRentalHistory = new LinkedList<>();

}
