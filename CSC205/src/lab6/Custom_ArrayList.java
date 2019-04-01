package lab6;

public abstract class Custom_ArrayList<T> implements ListADT<T>
{    
	private int NOT_FOUND = -1;    
	protected T[] list;    
	protected int rear;    
	public Custom_ArrayList()    
	{       
		this(100);     
	}    
	public Custom_ArrayList(int capacity)     
	{        
		rear = 0;        
		list = (T[]) new Object[capacity];    
	}    
	//DONE: Implement "removeFirst" method.
	public T removeFirst()
	{
		if(isEmpty())
			throw new RuntimeException("There is no 'first' element. List is empty..");
		T temp = list[0];
		remove(temp);
		return temp;
	}
	
	//DONE: Implement "removeLast" method.   (maybe)
	public T removeLast() 
	{
		if(isEmpty())
			throw new RuntimeException("There is no 'last' element. List is empty..");
		T temp = list[rear-1];
		list[rear-1] = null;
		rear--;
		return temp;
	}
	public T remove(T element)     
	{        
		T result;        
		int index = find(element);        
		if (index == NOT_FOUND)            
			throw new RuntimeException("Element " + element + " NOT found in Custom_ArrayList.");        
		result = list[index];        rear--;         for(int scan = index; scan < rear; scan++)            
			list[scan] = list[scan + 1];        list[rear] = null;         return result;    
	}    
	//DONE: Implement "first" method.    
	public T first()
	{
		if(isEmpty())
			throw new RuntimeException("There is no 'first' element. List is empty..");
		return list[0];
	}
	//Done: Implement "last" method.  
	public T last()
	{
		if(isEmpty())
			throw new RuntimeException("There is no 'last' element. List is empty..");
		return list[rear];
	}
	public boolean contains(T target)     
	{        
		return (find(target) != NOT_FOUND);    
	}    
	//DONE: Implement "isEmpty" method. 
	public boolean isEmpty()
	{
		if(list[0]!=null)
			return false;
		return true;
	}
	//DONE: Implement "size" method.
	public int size()
	{
		return rear;
	}
	private int find(T target)    
	{        
		if(!isEmpty())        
		{            
			for(int index = 0; index < rear; index++)            
			{                
				if(target.equals(list[index]))                     
				return index;            
			}        
		}        
		return -1;    
	}     
	//NOTE: This function is NOT private so as to allow    
	//subclasses to be able to increase their own lists.    
	protected void expandCapacity()     
	{        
		T[] newList = (T[]) new Object[list.length * 2];        
		for(int i = 0; i < list.length; i++)            
			newList[i] = list[i];        
		list = newList;    
	}
}