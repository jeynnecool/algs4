/*********************************************
 * Question:
 * 1.1.14
 * 
 * Environment: DrJava 
 * Compilation: javac Ex14.java
 * Execution: java Ex14
 * 
 * @author: Jing Xu 
 *********************************************/

public class Ex14
{
    public static void main(String[] args)
    {
        StdOut.println("Please enter an integer larger than 0: ");
        int i = Integer.parseInt(System.console().readLine());
        StdOut.println("result: " + lg(i));
    }
    
    public static int lg(int i)
    {
        int a;
        
        if(i == 1)
            a = 0;
        else
        {
            a = 0;
            for(int j = i; j > 1; j /= 2)
            {
                a += 1;
            }
        }
        
        return a;
    }
}