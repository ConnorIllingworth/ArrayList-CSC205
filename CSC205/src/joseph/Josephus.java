package joseph;

import java.util.List;
import java.util.ArrayList;

public class Josephus
{
	public static void main(String[] args)
	{
		int numPeople = 41, skip = 3;
		List<String> list = new ArrayList<String>();
		
		for(int count = 1; count <= numPeople; count++)
			list.add("Soldier #" + count);
		
		int targetIndex = 0;
		
		list.add(34, "nog");
		list.add("lul");
		
		System.out.println("The order is: ");
		while(!list.isEmpty())
		{
			System.out.println("\t" + list.remove(targetIndex));
			if(list.size() > 0)
				targetIndex = (targetIndex + skip -1) % list.size();
			
		}
	}
}
