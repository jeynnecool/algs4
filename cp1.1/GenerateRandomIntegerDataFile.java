public class GenerateRandomIntegerDataFile
{
    public static void main(String[] args)
    {
        for(int i = 0; i < 100; i++)
        {
            double r = StdRandom.random()  * 1010;
            StdOut.println((int)r);
        }
    }
}