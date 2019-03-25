package lab3;

public interface QueueADT<T>
{    
	//Adds one element to the rear of this queue.    
	public void enqueue(T element);    
	//Removes and returns the element at the front of this queue.    
	public T dequeue();    
	//Returns (without removing) the element at the front of this queue.    
	public T first();    
	//Returns true if queue contains no elements, otherwise it'll return false.     
	public boolean isEmpty();    
	//Returns number of elements within this queue.     
	public int size();
}