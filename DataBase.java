package tools_car_rental;

import java.util.LinkedList;
import java.util.List;

public class DataBase 
{
	private static List<Car> listOfCars = new LinkedList<>();
	private static List<Client> listOfClients = new LinkedList<>();
	private static List<Log> listOfLogs = new LinkedList<>();
	public static List<Car> getListOfCars() {
		return listOfCars;
	}
	public static List<Client> getListOfClients() {
		return listOfClients;
	}
	public static List<Log> getListOfLogs() {
		return listOfLogs;
	}
}
