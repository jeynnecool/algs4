/********************************************************
 *  Compilation:  javac Ex21.java
 * 
 *  exercises 1.1.21
 * 
 *  Read standard input, output name and average number
 *  Data file:    avrgin.txt
 *  Output file:  avrgout.txt
 *  Invoke: java-algs4 Ex21 < avrgin.txt > avrgout.txt
 ********************************************************/

/*
 * @author Jing Xu
 * 
 * */

public class Ex21
{ 
    public static void main(String[] args)
    {
        while(!StdIn.isEmpty())
        {
            String name = StdIn.readString();
            int a = StdIn.readInt();
            int b = StdIn.readInt();
            float avg = (float)a / (float)b;
            
            StdOut.printf("%s %d %d %.3f\n", name, a, b, avg);
        }
    }
}