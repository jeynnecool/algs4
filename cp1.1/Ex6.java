/*********************************************
 * Question:
 * 1.1.6
 * 
 * Environment: DrJava 
 * Compilation: javac Ex6.java
 * Execution: java Ex6
 * 
 * @author: Jing Xu 
 *********************************************/


public class Ex6
{
    public static void main(String[] args)
    {
        int f = 0;
        int g = 1;
        for (int i = 0; i <= 15; i++)
        {
            StdOut.println(f);
            f = f + g;
            g = f - g;
        }
    }
}