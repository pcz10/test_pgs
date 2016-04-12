package tools_car_rental;

public class Car
{
	public Car(String brand, String model)
	{
		this.brand = brand;
		this.model = model;
		this.status = true;
	}
	public boolean getStatus() {
		return status;
	}
	public boolean setStatus(boolean status) {
		return this.status = status;
	}
	@Override
	public String toString()
	{
		return "Car [brand=" + brand + ", model=" + model + ", status=" + status + "]";
	}
	private String brand;
	private String model;
	private boolean status;
}
