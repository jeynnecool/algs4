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
import java.awt.*;

public class CltPoint2D
{
    private int N;
    private Point[] points;
    private Point px;
    private Point py;
    private double shortestDistance;

    public CltPoint2D(int n)
    {
        this.N = n;
        points = new Point[N];
    }
    
    public void draw() {
        StdDraw.setCanvasSize(800, 800);
        StdDraw.setXscale(0, 100);
        StdDraw.setYscale(0, 100);
        StdDraw.setPenRadius(0.01);
        for (int i = 0; i < N; i++) {
            int x = StdRandom.uniform(100);
            int y = StdRandom.uniform(100);
            points[i] = new Point(x, y);
            points[i].draw();
        }
    }
    
    public double getShortestDistance();
    {
        for(int i = 1; i < N; i++)
        {
            for(int j = 0; j < i; j++)
            {
                double d = getDistance(point[i], points[j]);
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
        return shortestDistance;
    }
    
    public double getRadius(Point p) {
        double r = Math.sqrt(Math.pow(p.x,2) + Math.pow(p.y,2));
        return r;
    }
    
    public double getDistance(Point pt1, Point pt2) {
        double dx = pt2.getX() - pt2.getX();
        double dy = pt1.getY() - pt2.getY();
        double dt = Math.sqrt(Math.pow(dx,2) + Math.pow(dy,2));
        return dt;
    }
    
    public Point getPointX()
    {
        return px;
    }
    
    public Point getPointY()
    {
        return py;
    }
}