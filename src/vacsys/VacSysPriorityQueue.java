package vacsys;

/**
 * Interface for our VacSysHeap
 * 
 * @author jamesarama
 * 
 * @param <T>
 */
public interface VacSysPriorityQueue<T> {
	/**
	 * Queues in an individual patient
	 * 
	 * @public
	 * @param patient
	 */
	public abstract void enqueue(T patient);

	/**
	 * De-queues the first patient from our heap
	 * 
	 * @public
	 * @return patient
	 */
	public abstract T dequeue();

	/**
	 * Checks whether our heap is empty
	 * 
	 * @public
	 * @return true|false
	 */
	public abstract boolean isEmpty();

	/**
	 * Clear's our heap
	 * 
	 * @public
	 */
	public abstract void clear();

	/**
	 * Gets the size of our queue
	 * 
	 * @public
	 * @return size
	 */
	public abstract int getSize();

}
