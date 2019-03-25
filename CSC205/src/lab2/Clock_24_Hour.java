package lab2;

public class Clock_24_Hour implements Digital_Clock
{
	protected int hours;
	protected int minutes;
	
	public Clock_24_Hour()
	{
		hours = 0;
		minutes = 0;
	}
	
	public Clock_24_Hour(int hr, int min)
	{
		setTime(hr, min);
	}
	
	public String getTime()
	{
		String time = "";
		if(hours < 10)
			time += "0";
		time+= hours;
		time+= ":";
		if(minutes<10)
			time+="0";
		time+=minutes;
		return time;
	}
	
	public void incrementMinute()
	{
		minutes++;
		
		if(minutes >= 60)
		{
			incrementHour();
			minutes = 0;
		}
	}
	
	public void incrementHour()
	{
		hours++;
		if(hours>=24)
			hours = 0;
	}
	
	public void decrementMinute()
	{
		minutes--;
		
		if(minutes<=0)
		{
			decrementHour();
			minutes = 59;
		}
	}
	
	public void decrementHour()
	{
		hours--;
		if(hours<0)
			hours = 23;
	}
	
	

	private void setTime(int hr, int min)
	{
		if(hr < 0 || min < 0)
		{
			throw new IllegalArgumentException();
		}
		
		hours = hr;
		minutes = min;
	}
}