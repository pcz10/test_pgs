package tools_car_rental;

public class Starter 
{
	public void starter()
	{
		creator.createMenu();
	}
	public static void main(String [] args)
	{
		Starter start = new Starter();
		start.starter();
	}
	private UICreator creator = new UICreator();
}