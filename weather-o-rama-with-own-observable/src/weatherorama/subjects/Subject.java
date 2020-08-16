/**
 * 
 */
package weatherorama.subjects;

import weatherorama.observers.Observer;

/**
 * @author santhosh
 *
 */
public interface Subject {

	/**
	 * Both of these methods take an Observer as an argument; that is, the Observer
	 * to be registered or removed.
	 * 
	 * @param o
	 */
	public void registerObserver(Observer o);

	/**
	 * Both of these methods take an Observer as an argument; that is, the Observer
	 * to be registered or removed.
	 * 
	 * @param o
	 */
	public void removeObserver(Observer o);

	/**
	 * This method is called to notify all observers when the Subject’s state has
	 * changed.
	 */
	public void notifyObservers();
}
