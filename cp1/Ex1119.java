public class Ex1119
{
    public static long F(long[] f, int N)
    {
        if(N == 0)
        {
            f[0] = 0;
            return 0;
        }
        else if(N == 1)
        {
            f[1] = 1;
            return 1;
        }
        else
        {
            f[N] = f[N - 1] + f[N - 2];
            return f[N];
        }
        
    }
    
    public static void main(String[] args)
    {
        long[] f = new long[100];
        
        for (int N = 0; N < 100; N++)
            StdOut.println(N + " " + F(f, N));
    }
}