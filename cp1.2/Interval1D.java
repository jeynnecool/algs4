/****************************************
  * Question: 
  * 1.2.2 Write an Interval1D client that takes an int value N as 
  * command-line argument, reads N intervals (each defined by a pair 
  * of double values) from standard input, and prints all pairs that 
  * intersect.
  * 
  * Execution: java Interval1D N
  * 
  * @author: Jing Xu
  **************************************/

public class Interval1D
{
    private double left;
    private double right;
    
    public Interval1D(double x, double y)
    {
        if(x < y)
        {
            this.left = x;
            this.right = y;
        }
        else if( x > y)
        {  
            this.left = y;
            this.right = x;
        }
        else
            throw new RuntimeException("invalid interval");
    }
    
    public boolean intersects(Interval1D b)
    {
        Interval1D a = this;
        if(a.getRight() > b.getLeft())
            return true;
        else if(b.getRight() > a.getLeft())
            return true;
        
        return false;
    }
    
    public String toString()
    {
        return "[" + this.getLeft() + ", " + this.getRight() + "]";
    }
    
    public double getLeft()
    {
        return this.left;
    }
    
    public double getRight()
    {
        return this.right;
    }
    
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        Interval1D[] intervals = new Interval1D[N];
        
        for (int i = 0; i < N; i++) {
            double x = StdRandom.uniform(100);
            double y = StdRandom.uniform(100);
            intervals[i] = new Interval1D(x, y);
        }
        
        for(int i = 0; i < N; i++)
        {
            Interval1D a = intervals[i];
            for(int j = i+1; j < N; j++)
            {
                Interval1D b = intervals[j];
                if(a.intersects(b))
                    StdOut.println(a + " intersects " + b);
            }
        }
    }
}