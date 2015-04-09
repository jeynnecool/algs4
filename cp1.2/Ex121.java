/****************************************
 * Question:
 * 1.2.1 Write a Point2D client that takes an integer value N 
 * from the command line, generates N random points in the unit square, 
 * and computes the distance separating the closest pair of points.
 * 
 * Compilation: javac Ex121.java
 * Execution: java Ex121 N
 * External Class: XPoint.java
 ***************************************/

public class Ex121
{
    public static void main(String[] args) 
    {
        int N = Integer.parseInt(args[0]);
        StdDraw.setCanvasSize(800, 800);
        StdDraw.setXscale(0, 100);
        StdDraw.setYscale(0, 100);
        StdDraw.setPenRadius(0.01);
        XPoint[] points = new XPoint[N];
        for (int i = 0; i < N; i++) {
            int x = StdRandom.uniform(100);
            int y = StdRandom.uniform(100);
            points[i] = new XPoint(x, y);
            points[i].draw();
        }
        
        XPoint px = new XPoint(0, 0);
        XPoint py = new XPoint(0, 0);
        double shortestDistance = 0;
        
        for(int i = 1; i < N; i++)
        {
            for(int j = 0; j < i; j++)
            {
                double d = points[i].getDistance(points[j]);
                if(i == 1)
                {
                    shortestDistance = d;
                }
                else
                {
                    if(d < shortestDistance)
                    {
                        shortestDistance = d;
                        px = points[i];
                        py = points[j];
                    }
                }
            }
        }
        
        StdOut.println("closest pair points are:");
        StdOut.println("p1: " + px.toString());
        StdOut.println("p2: " + py.toString());
        StdOut.println("distance: " + shortestDistance);
    }
}
