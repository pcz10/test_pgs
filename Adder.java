package tools_car_rental;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Adder implements Addable
{
	@Override
	public void addCar() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj marke: ");
		String brand = sc.next();
		System.out.println("\nPodaj model: ");
		String model = sc.next();
		Car car = new Car(brand,model);
		DataBase.getListOfCars().add(car);
	}
	@Override
	public void addClient() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj imie: ");
		String name = sc.nextLine();
		System.out.println("\nPodaj nazwisko: ");
		String surname = sc.nextLine();
		System.out.println("\nPodaj narodowosc: ");
		String nationality = sc.nextLine();
		Client client = new Client(name,surname,nationality);
		DataBase.getListOfClients().add(client);
	}
	public void addLog(Log e)
	{
		DataBase.getListOfLogs().add(e);
	}
}
