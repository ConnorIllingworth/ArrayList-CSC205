package lab3;

public class ArrayStack<T> implements StackADT<T>
{
    private T[] stack; 
    private int top;
    
    public ArrayStack() 
    {
        this(100);
    }
    
    public ArrayStack(int capacity) 
    {
        top = 0;
        stack = (T[]) new Object[capacity];
    }
    
    public void push(T element) 
    {
        if(size() == stack.length)
            expandCapacity();
        
        stack[top] = element; 
        top++;
    }
    
    public T pop()    
    {
        if(isEmpty())
            throw new RuntimeException("Empty Stack.");
        
        top--; 
        T result = stack[top];
        stack[top] = null;
        
        return result;
    }
    
    public T peek()
    {
        if(isEmpty())
            throw new RuntimeException("Empty Stack.");
        
        return stack[top - 1]; 
    }
    
    //TODO: Implement "isEmpty" method.
    public boolean isEmpty()
    {
    	if(stack[0] == null)
    		return true;
    	else return false;
    }
    
    //TODO: Implement "size" method.
    public int size()
    {
    	return stack.length;
    }
    
    //Alternate implementation: stack = Arrays.copyOf(stack, stack.length * 2);
    private void expandCapacity() 
    {
        T[] newStack = (T[]) new Object[stack.length * 2];
        
        for(int i = 0; i < stack.length; i++)
            newStack[i] = stack[i];
        
        stack = newStack;
    }
}
