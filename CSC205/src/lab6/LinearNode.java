package lab6;

public class LinearNode<T>
{
    private LinearNode<T> next;
    private T element;
    
    //NOTE: It's crucial for [all] constructors set 'next' to "nothing".
    //No need for "LN(LinearNode)" or "LN(T, LinearNode)" constructors
    //(given the mutator and accessors methods that are available).
    public LinearNode()
    {
        this(null);
    }
    
    public LinearNode(T elem)
    {
        next = null;
        element = elem;
    }
    
    //Typical accessor functions for each [respective] attribute.
    public LinearNode<T> getNext() 
    {
        return next;
    }
    
    public T getElement() 
    {
        return element;
    } 
    
    //Typical mutator functions for each [respective] attribute.
    public void setNext(LinearNode<T> node) 
    {
        next = node;
    } 
    
    public void setElement(T elem) 
    {
        element = elem;
    }
}
