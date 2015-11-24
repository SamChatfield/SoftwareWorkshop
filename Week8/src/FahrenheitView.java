import java.util.Observable;
import java.util.Observer;

import javax.swing.JLabel;

public class FahrenheitView extends JLabel implements Observer
{
	
	private TemperatureModel model;
	
	public FahrenheitView(TemperatureModel model)
	{
		super();
		this.model = model;
		
		// FIX THIS
		double value = Math.floor(model.getFahrenheit() * 10D) / 10D;
//		double value = model.getFahrenheit();
		setText(value + " fahrenheit");
	}
	
	public void update(Observable observable, Object obj)
	{
		double value = model.getFahrenheit();
		setText(value + " fahrenheit");
	}
	
}
