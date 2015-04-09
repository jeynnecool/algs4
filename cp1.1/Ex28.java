/********************************************************
 * Question:
 * 1.1.28 Remove duplicates. Modify the test client in BinarySearch 
 * to remove any duplicate keys in the whitelist after the sort.
 * 
 * Compilation: javac Ex28.java
 * Whitelist: whitelist.txt
 * Keylist: dupkeylist.txt
 * Execution: java Ex28 whitelist.txt < keylist.txt
 *
 * @author: Jing Xu
 ********************************************************/

import java.util.Arrays;

public class Ex28
{
    public static int rank(int key, int[] a)
    {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi)
        {
            int mid = lo + (hi - lo) / 2;
            if
                (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else
                return mid;
        }
        return -1;
    }
    
    public static void main(String[] args)
    {
        int[] whitelist = In.readInts(args[0]);
        Arrays.sort(whitelist);
        
        while(!StdIn.isEmpty())
        {
            int key = StdIn.readInt();
            if(rank(key, whitelist) < 0)
                StdOut.println(key);
        }
    }
}