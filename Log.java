package tools_car_rental;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Log 
{
	private final static Logger LOGGER = Logger.getLogger("Rent history.");
	
	public Log()
	{
		LOGGER.setLevel(Level.INFO);
		LOGGER.info("Rented car." );
	}

	@Override
	public String () {
		return LOGGER.info("Rented car." );
	}
	
}