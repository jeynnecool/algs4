/****************************************************
 *  Compilation:  javac Ex9.java
 * 
 *  exercises 1.2.9
 * 
 *  Add Counter in BinarySearch
 *  Whitelist: whitelist.txt
 *  Key file: keylist.txt
 *  Invoke command: java-algs4 Ex9 whitelist.txt 
 * < keylist.txt
 *
 ****************************************************/

/*
 * @author Jing Xu
 * 
 * */

import java.util.Arrays;

public class Ex9
{
    public static int rank(int key, Counter examine, int[] a)
    {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi)
        {
            examine.increment();
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
        
        while (!StdIn.isEmpty())
        {
            int key = StdIn.readInt();
            Counter examine = new Counter("key_" + key);
            if (rank(key, examine, whitelist) < 0)
                StdOut.println(key);

            StdOut.println(examine.toString());
        }
    }
}