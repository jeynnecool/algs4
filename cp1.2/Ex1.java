/****************************************
 * Question:
 * 1.2.1 Write a Point2D client that takes an integer value N 
 * from the command line, generates N random points in the unit square, 
 * and computes the distance separating the closest pair of points.
 * 
 * Compilation: javac Ex1.java
 * Execution: java Ex1 N
 * External Class: XPoint.java
 * 
 * @author: Jing Xu
 ***************************************/

public class Ex1
{
    public static void main(String[] args) 
    {
        int N = Integer.parseInt(args[0]);
        CltPoint2D p = new CltPoint2D(N);
        p.draw();
        
        Point x = p.getPointX();
        Point y = p.getPointY();
        double d = p.getShortestDistance();
        
        StdOut.println("closest pair points are:");
        StdOut.println("p1: " + x.toString());
        StdOut.println("p2: " + y.toString());
        StdOut.println("distance: " + d);
    }
}
