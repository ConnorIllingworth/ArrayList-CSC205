package lab6;

public abstract class Custom_LinkedList<T> implements ListADT<T>
{
    protected int count;
    protected LinearNode<T> head, tail;     //NOTE: Don't forget that each 'Node'
                                            //object is only able to reference
    public Custom_LinkedList()              //themselves and their [ONE] 'next' node. 
    {
        count = 0;
        head = null;
        tail = null;
    }
}
