/*********************************************
 * Question:
 * 1.1.20 Write a recursive static method that computes the 
 * value of ln (N !)
 * 
 * Environment: DrJava 
 * Compilation:  javac Ex20.java
 * Execution: java Ex20
 * 
 * @author Jing Xu
 *********************************************/

public class Ex20
{
    public static double ln(int N)
    {
        if(N == 1)
            return 0;
        else
            return Math.log10(N) + ln(N - 1);
    }
    
    public static void main(String[] args)
    {
        StdOut.println(ln(1));
    }
}