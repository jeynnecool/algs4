/***************************
 * 
 * Question:
 * 1.2.12 Add a method dayOfTheWeek() to SmartDate that 
 * returns a String value Monday, Tuesday, Wednesday, Thursday, 
 * Friday, Saturday, or Sunday, giving the appropriate day of 
 * the week for the date. You may assume that the date is in 
 * the 21st century.
 * 
 * Compilation: javac Ex12.java
 * Execution: java Ex12
 * External Class: SmartDate.java
 * 
 * @author: Jing Xu
 ***************************/

import java.text.*;

public class Ex12 {
    public static void main(String[] args)
    {
        try
        {
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            java.util.Date d = df.parse("2015-04-08");
            SmartDate sd = new SmartDate(d);
            StdOut.println(sd.dayOfTheWeek());
        }
        catch(ParseException e)
        {
            StdOut.println(e.getErrorOffset());
        }
    } 
}