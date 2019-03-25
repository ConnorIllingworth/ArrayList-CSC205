package lab3;

import java.util.Scanner;
public class Reverse_Sentence
{
	public static void main(String[] args)
	{
		Scanner keybrd = new Scanner(System.in);
		String input;
		
		System.out.print("Enter a sentence: ");
		input = keybrd.nextLine();
		keybrd.close();
		
		Scanner reader = new Scanner(input);
		ArrayStack stack = new ArrayStack();
		
		while(reader.hasNext() )
		{
			stack.push(reader.next());
		}
		reader.close();
		
		while(!stack.isEmpty())
		{
			System.out.print(stack.pop() + " ");
		}
	}
}