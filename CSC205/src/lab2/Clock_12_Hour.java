package lab2;

public class Clock_12_Hour extends Clock_24_Hour //implements Digital_Clock
{
	/*protected int hours;
	protected int minutes;*/
	protected boolean amPM; //true = am  |  false = pm
	
	public Clock_12_Hour()
	{
		super(12,0);
		amPM = true;
	}

	public Clock_12_Hour(int hr, int min, boolean amPm)
	{
		super(hr,min);
		amPM = amPm;
	}

	/*private void setTime(int hr, int min, boolean amPm)
	{
		if(hr<0 || min < 0)
		{
			throw new IllegalArgumentException();
		}
		
		hours = hr;
		minutes = min;
		amPM = amPm;
	}*/
	
	/*
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
	*/

	public String getTime()
	{
		String time = "";
		if (hours < 10 || (hours>12 && hours<22))
			time += "0";
		
		if(hours<=12)
			time+=hours;
		else if(hours>12)
			time+=(hours-12);
		
		time+=":";
		
		if(minutes<10)
			time+="0";
		time+=minutes;
		
		if(hours>12)
			amPM = false; //sets it to PM
		else
			amPM = true;  //sets it to AM
		
		if(amPM == true)
			time+=" AM";
		else
			time+=" PM";
		return time;
	}
}