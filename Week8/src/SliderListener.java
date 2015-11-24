import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SliderListener implements ChangeListener
{
	
	private TemperatureModel model;
	private JSlider slider;
	
	public SliderListener(TemperatureModel model, JSlider slider)
	{
		this.model = model;
		this.slider = slider;
	}
	
	public void stateChanged(ChangeEvent e)
	{
		int value = slider.getValue();
		model.setCelsius(value);
	}
	
}
