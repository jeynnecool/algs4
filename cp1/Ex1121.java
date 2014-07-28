/***************************************************
 *  Data file:    avin.txt
 *  Output file:  avout.txt
 ***************************************************/

public class Ex1121
{ 
    public static void main(String[] args)
    {
        In in = new In(args[0]);
        Out out = new Out(args[1]);
        
        while(!in.isEmpty())
        {
            String name = in.readString();
            int a = in.readInt();
            int b = in.readInt();
            
            float c = (float)a / (float)b;
            out.printf("%s %.3f\n", name, c);
        }
    }
}