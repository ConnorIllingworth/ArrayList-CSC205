package lab3;

public interface StackADT<T>
{
    //Adds the specified element to the top of this stack. 
    public void push(T element);
  
    //Removes and returns the top element of this stack. 
    public T pop();

    //Returns (without removing) the top element of this stack. 
    public T peek();
  
    //Returns true if stack contains no elements, otherwise it'll return false. 
    public boolean isEmpty();

    //Returns number of elements within this stack. 
    public int size();
}
