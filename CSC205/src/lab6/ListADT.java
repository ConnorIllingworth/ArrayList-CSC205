package lab6;

//Specific types of lists will extend from this interface.
//NOTE: All code related to Iterators, and Iterable, has been omitted (for now).
public interface ListADT<T>
{
  public T removeFirst();     //Removes and returns the first element from this list.

  public T removeLast();      //Removes and returns the last element from this list.

  public T remove(T element); //Removes (and returns) the specified 'element' from this list.

  public T first();           //Returns (without removing) the first element of this list.

  public T last();            //Returns (without removing) the last element of this list.

  //Returns true if this list contains the [specified] 'target' element, otherwise it'll return false. 
  public boolean contains(T target);

  public boolean isEmpty();   //Returns true if list contains no elements, otherwise it'll return false. 

  public int size();          //Returns number of elements within this list. 
}
