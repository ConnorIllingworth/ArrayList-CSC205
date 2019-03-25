package lab2; 

public class Test_Code_for_Digital_Clock
{
    public static void main(String[] args) 
    {
        /*
         *  Note To Reader:
         *
         *  Change argument(s) to 'true' to execute method(s).
         *  Also, feel free to fiddle around with any of this test code.
         */
        test24HourClock(false);
        test12HourClock(true);
        
        //---------------------------------------------------------------------
        
        Digital_Clock clockOne = new Clock_24_Hour();
        
        clockOne.incrementHour();
        System.out.println(clockOne.getTime());   //Should print "01:00".
        
        clockOne.decrementMinute();
        System.out.println(clockOne.getTime());   //Should print "00:59".
        
        clockOne.decrementHour();
        System.out.println(clockOne.getTime());   //Should print "23:59".
        
        //---------------------------------------------------------------------
        
        Digital_Clock clockTwo = new Clock_12_Hour();
        
        clockTwo.decrementHour();
        System.out.println(clockTwo.getTime());   //Should print "11:00 PM".
        
        clockTwo.incrementMinute();
        System.out.println(clockTwo.getTime());   //Should print "11:01 PM".
        
        clockTwo.incrementHour();
        System.out.println(clockTwo.getTime());   //Should print "12:01 AM".
    }
    
    public static void test24HourClock(boolean run)
    {
        if(!run)
            return;
        
        //Should print all the times from "00:00" to "23:59".
        for(int hour = 0; hour < 24; hour++)
        {
            for(int minute = 0; minute < 60; minute++)
            {
                Digital_Clock clock = new Clock_24_Hour(hour, minute);
                System.out.println(clock.getTime());
            }
        }
    }
    
    public static void test12HourClock(boolean run)
    {
        if(!run)
            return;
        
        boolean beforeMidday = true;
        
        //First iteration should print all the times from "00:00AM" to "11:59AM".
        //Second iteration should print all the times from "00:00PM" to "11:59PM".
        
        //for(int count = 0; count < 2; count++)
        //{
            for(int hour = 0; hour < 24; hour++)
            {
                for(int minute = 0; minute < 60; minute++)
                {
                    Digital_Clock clock = new Clock_12_Hour(hour, minute, beforeMidday);
                    System.out.println(clock.getTime());
                }
            }
            
            beforeMidday = false;
        //}
    }
}
