package lab3;

import java.util.Scanner;

public class circleTEST
{
	 public static void main(String[] args)
	 {
	    CircleArrayQueue circleRay = new CircleArrayQueue(100);
	    Scanner keybrd = new Scanner(System.in);
	    String input;
	    input = keybrd.nextLine();
	    circleRay.enqueue(input);

	    for(int i = 0; i < 98; i++)
	    {
	    	input = Integer.toString(i);
	    	circleRay.enqueue(input);
	    }
	    
	    System.out.println(circleRay.size());
	    for(int count = 1; count < 1+ circleRay.size(); count++)
	    {
	    	System.out.println(count + ": " + circleRay.first());
	    	circleRay.dequeue();
	    }
	    
	    
	    input = keybrd.nextLine();
	    circleRay.enqueue(input);
	    input = keybrd.nextLine();
	    circleRay.enqueue(input);
	    input = keybrd.nextLine();
	    circleRay.enqueue(input);
	    
	    
	    System.out.println(circleRay.size());
	    for(int count = 1; count < 1+ circleRay.size(); count++)
	    {
	    	System.out.println(count + ": " + circleRay.first());
	    	circleRay.dequeue();
	    }
	 }
}
