package lab6;

public interface UnorderedListADT<T> extends ListADT<T>
{
    //Inserts said 'element' to the front of this list.
    public void addToFront(T element);  

    //Inserts said 'element' to the rear of this list.
    public void addToRear(T element); 

    //Inserts 'element' into list AFTER the 'target' element.
    public void addAfter(T element, T target);
}
