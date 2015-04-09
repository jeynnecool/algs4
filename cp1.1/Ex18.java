/*********************************************
 * Question:
 * 1.1.18
 * 
 * Environment: DrJava 
 * Compilation: javac Ex18.java
 * Execution: java Ex18
 * 
 * @author: Jing Xu 
 *********************************************/

public class Ex18
{
    public static int mystery(int a, int b)
    {
        if (b == 0)
            return 0;
        if (b % 2 == 0) 
            return mystery(a+a, b/2);
        return mystery(a+a, b/2) + a;
    }
    
    public static int mystery2(int a, int b)   
    {
        if (b == 0)
            return 0;
        if (b % 2 == 0)
            return mystery2(a*a, b/2);
        return mystery2(a*a, b/2) * a;
    }
    
    public static void main(String[] args)
    {
        StdOut.println(mystery(2, 25));   //50
        StdOut.println(mystery(3, 11));   //33
        StdOut.println(mystery(1, 1));    //1
        
        StdOut.println(mystery2(2, 25));   //0
        StdOut.println(mystery2(3, 11));   //0
        StdOut.println(mystery2(1, 1));    //0
    }
}