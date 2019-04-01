package lab6;

/*
 *  IMPORTANT: Since [all] elements of an ordered list need some sort of basis 
 *  of comparison, for this lecture's version of 'OrderedList', generic 'T' can 
 *  only be set with a class that implements (or is derived from another class 
 *  that implements) the 'Comparable' interface. Without this, all subclasses
 *  would have to double-check whether or not their given 'element' is something 
 *  that is even comparable with the [other] elements (within their list).
 */
public interface OrderedListADT<T extends Comparable<T>> extends ListADT<T>
{
    //Inserts said 'element' into this list (at a proper location).
    public void add(T element);
}
