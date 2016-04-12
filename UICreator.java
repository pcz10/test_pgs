package tools_car_rental;

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
	public void createMenu()
	{
		Scanner sc = new Scanner(System.in);
		while(true)
		{		
			displayOptions();
			System.out.println("Which option do you want to execute?");
			int i = sc.nextInt();
			switch(i)
				{
				case 1:
					adder.addCar();
					break;	
			
				case 2:
					adder.addClient();
					break;
				case 3:
					renter.rentCar();
					break;
				case 4:
					displayer.displayAvailableCars();
					break;
				case 5:
					displayer.displayClients();
					break;
				case 6:
					displayer.displayRentLogs();
					break;
				case 7:
					System.exit(0);
					break;
				default:
					System.out.println("Wrong number selected.\n");
				}
			}
	}
		
	
	private Displayer displayer = new Displayer();
	private Renter renter = new Renter();
	private Adder adder = new Adder();
}
