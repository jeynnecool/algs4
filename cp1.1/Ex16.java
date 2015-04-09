/*********************************************
 * Question:
 * 1.1.16
 * 
 * Environment: DrJava 
 * Compilation: javac Ex16.java
 * Execution: java Ex16
 * 
 * @author: Jing Xu 
 *********************************************/

public class Ex16
{
    public static String exR1(int n)
    {
        if (n <= 0) return "";
        return exR1(n-3) + n + exR1(n-2) + n;
    }
    
    public static void main(String[] args)
    {
        StdOut.println(exR1(6));
    }
}