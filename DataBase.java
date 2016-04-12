package tools_car_rental;

import java.util.LinkedList;
import java.util.List;

public class DataBase 
{
	public void addCar(Car car)
	{
		this.listOfCars.add(car);
		System.out.println(car);
	}
	public void addClient(Client client)
	{
		this.listOfClients.add(client);
	}
	public List<Car> getListOfCars() {
		return listOfCars;
	}
	public List<Client> getListOfClients() {
		return listOfClients;
	}
	private List<Car> listOfCars = new LinkedList<>();
	private List<Client> listOfClients = new LinkedList<>();
	private List<Log> listOfLogs = new LinkedList<>();

}
