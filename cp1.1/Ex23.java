/********************************************************
 * Quesiton:
 * 1.1.23 Add to the BinarySearch test client the ability to respond 
 * to a second argument: + to print numbers from standard input that 
 * are not in the whitelist, - to print numbers that are in the whitelist.
 * 
 * Rewrite Binary Search use rank()
 * 
 * Compilation:  javac Ex23.java
 * Whitelist example: data01.txt
 * Execution: java Ex23 data01.txt 15 + 
 * 
 * @author: Jing Xu
 ********************************************************/

import java.util.Arrays;

public class Ex23
{
    public static int rank(int key, int[] a, int depth)
    {
        return rank(key, a, 0, a.length - 1, depth);
    }
    
    public static int rank(int key, int[] a, int lo, int hi, int dep)
    {
        if (lo > hi) 
            return -1;
        
        trace(lo, hi, dep);
        dep += 1;
        
        int mid = lo + (hi - lo) / 2;
        
        if (key < a[mid])
            return rank(key, a, lo, mid - 1, dep);
        else if (key > a[mid])
            return rank(key, a, mid + 1, hi, dep);
        else
            return mid;
    }
    
    public static void trace(int lo, int hi, int dep)
    {
        for(int i = 0; i < dep; i++)
            StdOut.printf("\t");
        StdOut.printf("%d %d \n", lo, hi);
    }
    
    public static void main(String[] args)
    {
        int[] list = new In(args[0]).readAllInts();
        Arrays.sort(list);

        while(!StdIn.isEmpty())
        {
            int key = StdIn.readInt();
            String isPrint = StdIn.readString();
            
            StdOut.println(key);
            StdOut.println(isPrint);
            
            if(isPrint == "+")
            {
                if(rank(key, list, 0) > 0)
                    StdOut.println(key);
            }
            else if(isPrint == "-")
            {
                if(rank(key, list, 0) < 0)
                    StdOut.println(key);
            }
        }
    }
}