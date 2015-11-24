import java.util.Observable;

public class TemperatureModel extends Observable
{
	
	private Temperature temp;
	
	public TemperatureModel(Temperature temp)
	{
		super();
		this.temp = temp;
	}
	
	public double getCelsius()
	{
		return temp.getCelsius();
	}
	
	public double getFahrenheit()
	{
		return temp.getFahrenheit();
	}
	
	public void setCelsius(double celsius)
	{
		temp.setCelsius(celsius);
		setChanged();
		notifyObservers();
	}
	
	public void setFahrenheit(double fahrenheit)
	{
		temp.setFahrenheit(fahrenheit);
		setChanged();
		notifyObservers();
	}
	
}
