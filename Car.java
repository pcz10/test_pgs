package tools_car_rental;

public class Car
{
	public Car(String brand, String model)
	{
		if (brand!= null && model!= null)
		{	
		this.brand = brand;
		this.model = model;
		this.availableStatus = true;
		}
		else
			System.out.println("Enter some values");
	}
	public boolean getStatus() {
		return availableStatus;
	}
	public boolean setStatus(boolean status) {
		return this.availableStatus = status;
	}
	@Override
	public String toString()
	{
		return "Car [brand = " + brand + ", model = " + model + ", available status = " + availableStatus + "]";
	}
	private String brand;
	private String model;
	private boolean availableStatus;
}
