/**
 * 
 */
package weatherorama.subjects;

import java.util.Observable;

/**
 * We don’t need to keep track of our observers anymore, or manage their
 * registration and removal, (the superclass will handle that) so we’ve removed
 * the code for register, add and notify.
 * 
 * Make sure we are importing the right Observer/Observable.
 * 
 * @author santhosh
 *
 */
public class WeatherData extends Observable {
	private float temperature;
	private float humidity;
	private float pressure;

	/**
	 * Our constructor no longer needs to create a data structure to hold Observers.
	 */
	public WeatherData() {
	}

	public void measurementsChanged() {
		/**
		 * We now first call setChanged() to indicate the state has changed before
		 * calling notifyObservers().
		 */
		setChanged();
		/**
		 * Notice we aren’t sending a data object with the notifyObservers() call. That
		 * means we’re using the PULL model.
		 */
		notifyObservers();
	}

	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

	/**
	 * These methods aren’t new, but because we are going to use “pull” we thought
	 * we’d remind you they are here. The Observers will use them to get at the
	 * WeatherData object’s state.
	 * 
	 * @return
	 */
	public float getTemperature() {
		return temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}
}
