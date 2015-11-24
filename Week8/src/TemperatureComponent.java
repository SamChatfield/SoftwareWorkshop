import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JSlider;

public class TemperatureComponent extends JPanel
{
	
	public TemperatureComponent(Temperature temp, int min, int max, int initial)
	{
		super();
		
		// model
		TemperatureModel model = new TemperatureModel(temp);
		
		// views
		CelsiusView celsiusView = new CelsiusView(model);
		FahrenheitView fahrenheitView = new FahrenheitView(model);
		
		// make views observe model
		model.addObserver(celsiusView);
		model.addObserver(fahrenheitView);
		
		// controls
		JSlider slider = new JSlider(min, max, initial);
		slider.setPaintTicks(true);
		slider.setMajorTickSpacing((max - min) / 4);
		slider.setPaintLabels(true);
		slider.setLabelTable(slider.createStandardLabels(slider.getMajorTickSpacing()));
		
		// listeners
		SliderListener sliderListener = new SliderListener(model, slider);
		
		// make listeners listen to controls
		slider.addChangeListener(sliderListener);
		
		// place views and controls on panel
		add(celsiusView);
		add(slider);
		add(fahrenheitView);
	}
	
}
