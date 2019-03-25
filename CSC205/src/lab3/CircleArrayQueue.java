package lab3;

public class CircleArrayQueue<T> implements QueueADT<T>
{    
	private T[] queue;    
	private int front, rear;   
	private int count;    
	
	
	public CircleArrayQueue()     
	{        
		this(100);    
	}    
	
	public CircleArrayQueue(int capacity)     
	{        
		queue = (T[]) new Object[capacity];        
		front = 0;        
		rear = 0;       
		count = 0;    
	}    
	
	public void enqueue(T element)    
	{        
		if(size() == queue.length)             
			expandCapacity();         
		queue[rear] = element;         
		rear = (rear + 1) % queue.length;         
		count++;    
		}    
	
	public T dequeue()     
	{        
		if(isEmpty())            
		throw new RuntimeException("Empty Queue.");       
		T result = queue[front];        
		queue[front] = null;        
		front = (front + 1) % queue.length;       
		count--;        return result;   
	}    
	
	//TODO: Implement "first" method. 
	public T first()
	{
		T firstInQ;
		firstInQ = queue[front];
		return firstInQ;
	}
	
	//TODO: Implement "isEmpty" method.   
	public boolean isEmpty()
	{
		if(queue[front] == null)
			return true;
		return false;
	}
	
	//TODO: Implement "size" method.    
	public int size()
	{
		int num;
		num = front - rear;
		if (num < 0)
			return -num;
		return num;
	}
	
	private void expandCapacity()     
	{        
		T[] newQueue = (T[]) new Object[queue.length * 2];  
		
		for(int index = 0; index < count; index++)        
		{           
			newQueue[index] = queue[front];             
			front = (front + 1) % queue.length;        
		}  
		
		front = 0;         
		rear = count;         
		queue = newQueue;    
	}
}