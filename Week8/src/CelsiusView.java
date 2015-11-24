import java.util.Observable;
import java.util.Observer;

import javax.swing.JLabel;

public class CelsiusView extends JLabel implements Observer
{
	
	private TemperatureModel model;
	
	public CelsiusView(TemperatureModel model)
	{
		super();
		this.model = model;
		
		double value = model.getCelsius();
		setText(value + " celsius");
	}
	
	public void update(Observable observable, Object obj)
	{
		double value = model.getCelsius();
		setText(value + " celsius");
	}
	
}
