package tools_car_rental;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UICreator 
{
	public void displayOptions()
	{
		System.out.println("********************************************");
		System.out.println("\n1. Add car to database.");
		System.out.println("\n2. Add client to database.");
		System.out.println("\n3. Rent a car(CHANGE RENT STATUS).");
		System.out.println("\n4. Display available cars.");
		System.out.println("\n5. Display clients list.");
		System.out.println("\n6. Display rent logs.");
		System.out.println("\n7. Shutdown application.");
		System.out.println("********************************************");
	}
	private String getBrandFromUser()
	{
		System.out.println("Type car brand: ");
		String brand = sc.next();
		return brand;
	}
	private String getModelFromUser()
	{
		System.out.println("\nType car model: ");
		String model = sc.next();
		return model;
	}
	private String getNameFromUser()
	{
		System.out.println("Type client name: ");
		String name = sc.next();
		return name;
	}
	private String getSurnameFromUser()
	{
		System.out.println("\nType client surname: ");
		String surname = sc.next();
		return surname;
	}
	public void createMenu()
	{
		DataBase controlVar = new DataBase();
		Rentable renter = new Renter(controlVar);
		Displayer displayer = new Displayer(controlVar);
		while(true)
		{	
			displayOptions();
			System.out.println("Which option do you want to execute?");
			int i=0; 
			try{
				i = sc.nextInt();
			}
			catch(InputMismatchException e)
			{
				System.out.println("Error. Input must be integer. ");
				sc.next();
				continue;
			}
			switch(i)
				{
				case 1:
					String brand = getBrandFromUser();
					String model = getModelFromUser();
					Car car = new Car(brand,model);
					controlVar.addCar(car);
					break;	
				case 2:
					String name = getNameFromUser();
					String surname = getSurnameFromUser();
					Client client = new Client(name, surname);
					controlVar.addClient(client);
					break;
				case 3:
					renter.rent();
					break;
				case 4:
					displayer.displayAvailableCars();
					break;
				case 5:
					displayer.displayClients();
					break;
				case 6:
					displayer.displayRentalHistory();
					break;
				case 7:
					System.exit(0);
					break;
				default:
					System.out.println("Wrong number selected.\n");
				}
			}
	}
	private Scanner sc = new Scanner(System.in);
}
