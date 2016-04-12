package tools_car_rental;

public class Client 
{
	public Client(String name,String surname,String nationality)
	{
		this.name=name;
		this.surname=surname;
		this.nationality=nationality;
	}
	
	@Override
	public String toString() {
		return "Client [name=" + name + ", surname=" + surname + ", nationality=" + nationality + "]";
	}
	
	private String name;
	private String surname;
	private String nationality;
}
