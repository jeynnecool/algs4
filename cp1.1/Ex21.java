/********************************************************
 * Question:
 * 1.1.21 Write a program that reads in lines from standard 
 * input with each line containing a name and two integers and 
 * then uses printf() to print a table with a column of the names, 
 * the integers, and the result of dividing the first by the second, 
 * accurate to three decimal places. You could use a program like 
 * this to tabulate batting averages for baseball players or grades 
 * for students.
 * 
 * Environment: DrJava
 * Compilation: javac Ex21.java
 * Data example: avrgin.txt
 * Execution: java Ex21
 * 
 * @author: Jing Xu
 ********************************************************/

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