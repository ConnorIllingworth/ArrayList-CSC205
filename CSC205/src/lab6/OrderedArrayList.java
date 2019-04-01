package lab6;

public class OrderedArrayList<T extends Comparable<T>> extends Custom_ArrayList<T> implements OrderedListADT<T>
{
    public OrderedArrayList() 
    {
        this(100);
    }
    
    public OrderedArrayList(int capacity) 
    {
        super(capacity);
        
        list = (T[]) new Comparable[capacity];
    }
    
    public void add(T element)
    {
        if(size() == list.length)
            expandCapacity();
        
        int index = 0;
        
        for( ; index < rear; index++)
        {
            if(element.compareTo(list[index]) <= 0)
                break; 
        }
        
        for(int scan = rear; scan > index; scan--)
            list[scan] = list[scan - 1];
        
        list[index] = element;
        rear++;
    }
    
    protected void expandCapacity() 
    {
        T[] newList = (T[]) new Comparable[list.length * 2];
        
        for(int i = 0; i < list.length; i++)
            newList[i] = list[i];
        
        list = newList;
    }
}
