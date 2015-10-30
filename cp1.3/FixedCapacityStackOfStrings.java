/***********************************
  * Question 1.3.1
  *
  * Add a method isFull() to FixedCapacityStackOfStrings.
  * 
  * @author: Jing Xu
  * 
  ***********************************/

public class FixedCapacityStackOfStrings
{
    private String[] a;
    private int N;
    
    public FixedCapacityStackOfStrings(int cap)
    {
        a = new String[cap];
    }
    
    public boolean isEmpty()
    {
        return N == 0;
    }
    
    public int size()
    {
        return N;
    }
    
    public void push(String item)
    {
        a[N++] = item;
    }
    
    public String pop()
    {
        return a[--N];
    }
    
    public boolean isFull()
    {
        if(this.size() == a.length)
            return true;
        else
            return false;
    }
}
