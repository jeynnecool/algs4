public class Point2DClient
{
    private int N;
    private double x;
    private double y;
    
    public XPoint() {
        super();
    }
    
    public XPoint(double x, double y) {
        super(x, y);
        this.x = x;
        this.y = y;
    }
    
    public double getRadius() {
        double r = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
        return r;
    }
    
    public double getDistance(XPoint pt) {
        double dx = pt.getX() - this.getX();
        double dy = pt.getY() - this.getY();
        double dt = Math.sqrt(Math.pow(dx,2) + Math.pow(dy,2));
        return dt;
    }
    
    public void draw() {
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
    }
    
    public void draw(int n) {
        StdDraw.setCanvasSize(800, 800);
        StdDraw.setXscale(0, 100);
        StdDraw.setYscale(0, 100);
        StdDraw.setPenRadius(0.01);
        XPoint[] points = new XPoint[N];
        for (int i = 0; i < n; i++) {
            int x = StdRandom.uniform(100);
            int y = StdRandom.uniform(100);
            points[i] = new XPoint(x, y);
            points[i].draw();
        }
    }
        
    public double getX() {
        return this.x;
    }
    
    public double getY() {
        return this.y;
    }
    
    public void setN(int value) {
        this.N = value;
    }
    
    public int getN() {
        return this.N;
    }
}