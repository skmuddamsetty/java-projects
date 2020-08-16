/**
 * 
 */
package weatherorama.observers;

/**
 * The Observer interface is implemented by all observers, so they all have to
 * implement the update() method. Here we’re following Mary and Sue’s lead and
 * passing the measurements to the observers.
 * 
 * @author santhosh
 *
 */
public interface Observer {
	/**
	 * These are the state values the Observers get from the Subject when a weather
	 * measurement changes
	 * 
	 * @param temp
	 * @param humidity
	 * @param pressure
	 */
	public void update(float temp, float humidity, float pressure);
}
