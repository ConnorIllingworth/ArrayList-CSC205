package labs;

public class Test_Code_for_Circle 
{
    public static void main(String[] args) 
    {
        /*** Testing constructors ***/
        Circle c1 = new Circle();
        Circle c2 = new Circle(3);
        Circle c3 = new Circle(-9.5);
	Circle c4 = new Circle(1, 2, 1.5);
        Circle c5 = new Circle(3.5, 7.25, -5);
        Circle c6 = new Circle(-1.99, -1.99, 1);
        
        printCircle("c1", c1);                                              //Should be: r = 0   | (0, 0)
	printCircle("c2", c2);                                                  //Should be: r = 3   | (0, 0)
	printCircle("c3", c3);                                                  //Should be: r = 0   | (0, 0)
	printCircle("c4", c4);                                                  //Should be: r = 1.5 | (1, 2)
	printCircle("c5", c5);                                                  //Should be: r = 0   | (3.25, 7.25)
	printCircle("c6", c6);                                                  //Should be: r = 1   | (-1.99, -1.99)
	System.out.println();
        
        /*** Messing around with my objects and their attributes ***/
	c1.setRadius(2.5);
	c1.center_X = -1;
	c1.center_Y = -1;
	printCircle("c1", c1);                                                  //Should be: r = 2.5 | (-1, -1)
        
        c3.setRadius(-2.5);
	c3.center_X = c1.center_X + 3;
	c3.center_Y = c1.center_Y - 1;
	printCircle("c3", c3);                                                  //Should be: r = 0   | (2, -2)
        System.out.println("\n----------------------------------------\n");
        
        /*** Testing the calculate functions ***/
	System.out.println("c1 area = " + c1.getArea());                        //Should be: ~19.6349375
	System.out.println("c2 area = " + c2.getArea());                        //Should be: ~28.27431
	System.out.println("c3 area = " + c3.getArea());                        //Should be: 0
	System.out.println("c4 area = " + c4.getArea());                        //Should be: ~7.0685775
	System.out.println("c5 area = " + c5.getArea());                        //Should be: 0
	System.out.println("c6 area = " + c6.getArea() + "\n");                 //Should be: ~3.14159

	System.out.println("c1 circ. = " + c1.getCircumference());              //Should be: ~15.70795
	System.out.println("c2 circ. = " + c2.getCircumference());              //Should be: ~18.84954
	System.out.println("c3 circ. = " + c3.getCircumference());              //Should be: 0
	System.out.println("c4 circ. = " + c4.getCircumference());              //Should be: ~9.42477
	System.out.println("c5 circ. = " + c5.getCircumference());              //Should be: 0
	System.out.println("c6 circ. = " + c6.getCircumference() + "\n");       //Should be: ~6.28318
        System.out.println("----------------------------------------\n");
        
        /*** Testing intersect functions ***/
	testIntersect(1, 1, c2);                                                //Should be: true
	testIntersect(3, 3, c2);                                                //Should be: false
	testIntersect(0, 3, c2);                                                //Should be: true
        testIntersect(3, 0, c2);                                                //Should be: true
	System.out.println("----------------------------------------\n");

	testIntersect(new Circle(0, 0, 1), new Circle(1, 0, 1));                //Should be: true
	testIntersect(new Circle(0, 0, 1), new Circle(2, 0, 1));                //Should be: true
        testIntersect(new Circle(0, 0, 1), new Circle(3, 0, 1));                //Should be: false
        testIntersect(new Circle(-1, -1, 2), new Circle(1, 1, 0));              //Should be: false
        testIntersect(new Circle(-1, -1, 2), new Circle(0, 0, 0));              //Should be: true
    }
    
    private static void printCircle(String name, Circle c)
    {
        System.out.print(name + ": " + "radius = " + c.getRadius() + " | ");

        printPoint(c.center_X, c.center_Y, "center", false);
    }
    
    private static void printPoint(double X, double Y, String name, boolean printExtraLineBreak)
    {
        System.out.println(name + ": (" + X + ", " + Y + ")");

        if(printExtraLineBreak)
            System.out.println();
    }
    
    private static void testIntersect(double X, double Y, Circle c)
    {
        printPoint(X, Y, " Other", false);
        printCircle("Circle", c);
        boolean result = c.intersect(X, Y);

        System.out.println("Result: " + result + "\n");
    }
    
    private static void testIntersect(Circle c1, Circle c2)
    {
        printCircle("C1", c1);
        printCircle("C2", c2);
        boolean result = c1.intersect(c2);

        System.out.println("Result: " + result + "\n");
    }
}