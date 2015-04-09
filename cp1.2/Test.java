import java.text.*;

public class Ex13
{
    public static void main(String[] args)
    {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        try
        {
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