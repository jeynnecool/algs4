import java.util.*;

public class SmartDate extends java.util.Date
{
    private java.util.Date date;
    
    public SmartDate(java.util.Date d)
    {
        this.date = d;
    }
    
    public String dayOfTheWeek()
    {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int dow = cal.get(Calendar.DAY_OF_WEEK);
        
        String dowString = "unknown";
        switch(dow) {
            case 1: dowString = "Monday";
            break;
            case 2: dowString = "Tuesday";
            break;
            case 3: dowString = "Wednesday";
            break;
            case 4: dowString = "Thursday";
            break;
            case 5: dowString = "Friday";
            break;
            case 6: dowString = "Saturday";
            break;
            case 7: dowString = "Sunday";
            break;
            default: dowString = "unkown";
            break;
        }
        return dowString;
    }
}