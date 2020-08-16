/**
 * 
 */
package weatherorama.displays;

import java.util.Observable;
import java.util.Observer;

import weatherorama.subjects.WeatherData;

/**
 * We now are implementing the Observer interface from java.util.
 * 
 * Again, make sure we are importing the right Observer/Observable.
 * 
 * @author santhosh
 *
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

	Observable observable;
	private float temperature;
	private float humidity;

	/**
	 * Our constructor now takes an Observable and we use this to add the current
	 * conditions object as an Observer.
	 * 
	 * @param observable
	 */
	public CurrentConditionsDisplay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}

	/**
	 * We’ve changed the update() method to take both an Observable and the optional
	 * data argument. In update(), we first make sure the observable is of type
	 * WeatherData and then we use its getter methods to obtain the temperature and
	 * humidity measurements. After that we call display().
	 */
	@Override
	public void update(Observable obs, Object arg) {
		if (obs instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) obs;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			display();
		}

	}

	@Override
	public void display() {
		System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
	}

}
