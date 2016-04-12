package tools_car_rental;

public class Client 
{
	public Client(String name,String surname)
	{
		this.name=name;
		this.surname=surname;
	}
	
	@Override
	public String toString() {
		return "Client [name=" + name + ", surname=" + surname +"]";
	}
	
	private String name;
	private String surname;
}
