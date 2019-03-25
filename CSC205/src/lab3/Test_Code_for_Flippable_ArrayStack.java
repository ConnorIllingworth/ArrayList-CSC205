package lab3;

public class Test_Code_for_Flippable_ArrayStack 
{
    public static void main(String[] args)
    {
        Flippable_ArrayStack stack = new Flippable_ArrayStack();
        
        stack.push("D");
        stack.push("C");
        stack.push("B");
        stack.push("A");
        
        printStack(stack);      //Should be "Top: A B C D"
        
        stack.flip();
        
        printStack(stack);      //Should be "Top: D C B A"
    }
    
    //Needed if our stack(s) doesn't implement its own "toString" method.
    //The 'temp' stack that's created here makes it so that the original
    //'stack' will remain in tact after this function resolves itself.
    public static void printStack(ArrayStack stack)
    {
        ArrayStack temp = new ArrayStack(stack.size());
        
        System.out.print("Top: ");
        while(!stack.isEmpty())
        {
            Object value = stack.pop();
            System.out.print(value + " ");
            temp.push(value);
        }
        System.out.println();
        
        while(!temp.isEmpty())
            stack.push(temp.pop());
    }
}
