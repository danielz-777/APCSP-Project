package Java2;

import Java2.TurtleDrawing.Turtle;

public class SquareSpiral
{
    public static void main(String[] args) 
    {
	    Turtle bob = new Turtle();
        for(int i=0;i<360;i++)
        {		
            bob.forward(i*1.25);
            bob.left(90.25);
        }
    }
}