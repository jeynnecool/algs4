/*********************************************
 * Question:
 * 1.1.7
 * 
 * Environment: DrJava 
 * Compilation: javac Ex7.java
 * Execution: java Ex7
 * 
 * @author: Jing Xu 
 *********************************************/

public class Ex7
{
    public static void main(String[] args)
    {
        // a
        double t = 9.0;
        while(Math.abs(t - 9.0/t) > .001)
            t = (9.0/t + t) / 2.0;
        StdOut.printf("%.5f\n", t);
        
        // b
        int sumB = 0;
        for(int i = 1; i < 1000; i++)
            for(int j = 0; j < i; j++)
                sumB++;
        StdOut.println(sumB);
        
        // c 
        //int sumC = 0;
        //for(int i = 1; i < 1000; i *= 2)
        //    for(int j = 0; j < N; j++)
        //        sumC++;
        //StdOut.println(sumC);
    }
}