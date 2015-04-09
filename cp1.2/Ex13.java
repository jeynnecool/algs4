/*****************************************
 * Question:
 * 1.2.13 Using our implementation of Date as a model (page 91), 
 * develop an implementationof Transaction.
 * 
 * Environment: DrJava
 * Compilation: javac Ex13.java
 * Execution: java Ex13
 * External Class: Transaction.java
 * 
 * @author: Jing Xu
*****************************************/

import java.text.*;

public class Ex13
{
    public static void main(String[] args)
    {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        try
        {
            /**
             * this part is so freaking confusing
             * need to specify type as java.util.Date
             * by default, Date is java.sql.Date
             * */
            java.util.Date d = df.parse("2015-04-08");
            Transaction a = new Transaction("test", d, 33.76);
            StdOut.println(a.toString());
        }
        catch(ParseException e)
        {
            StdOut.println(e.getErrorOffset());
        }
    }
}