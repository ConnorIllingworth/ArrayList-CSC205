package lab3;

import java.util.Scanner;
public class Flippable_ArrayStack<T> extends ArrayStack<T>
{
	public Flippable_ArrayStack()
	{
		super(100);
	}
	
	public Flippable_ArrayStack(int capacity)
	{
		super(capacity);
	}
	
	public void flip()
	{
		String sentence = null;

		while(!isEmpty())
		{
			sentence += (pop() + " ");
		}
		Scanner reader = new Scanner(sentence);
		System.out.println(sentence);
		/*
		while(reader.hasNext())
		{
			push(reader.next());
		}
		reader.close();
		*/
	}
}
