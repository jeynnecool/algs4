/*****************************************
 * Question:
 * 1.2.14 Using our implementation of equals() in Date 
 * as a model (page 103), develop implementations of 
 * equals() for Transaction.
 * 
 * Environment: DrJava
 * Compilation: javac Ex14.java
 * Execution: java Ex14
 * External Class: Transaction.java
 * 
 * @author: Jing Xu
*****************************************/

import java.text.*;

public class Ex14
{
    public static void main(String[] args)
    {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        try
        {
            java.util.Date d1 = df.parse("2015-04-08");
            Transaction a = new Transaction("test", d1, 33.76);
            StdOut.println("transaction a: " + a.toString());
            
            Transaction b = new Transaction("test", d1, 35.65);
            StdOut.println("transaction b: " + b.toString());
            
            StdOut.println("equal: " + a.equals(b));
        }
        catch(ParseException e)
        {
            StdOut.println(e.getErrorOffset());
        }
    }
}