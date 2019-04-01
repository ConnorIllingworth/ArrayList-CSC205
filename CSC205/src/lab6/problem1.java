package lab6;

import java.util.Scanner;

public class problem1
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int input = -1;
		
		UnorderedLinkedList singles = new UnorderedLinkedList();
		UnorderedLinkedList doubles = new UnorderedLinkedList();
		
		System.out.println("Input values 1-99 (0 to stop)");
		while(input != 0)
		{
			input = scan.nextInt();
			if(input>= 10)
				doubles.addToRear(input);
			else
				singles.addToRear(input);
		}
	}
}
