/****************************************
 * Question:
 * 1.2.4
 * 
 * Compilation: javac Ex4.java
 * Execution: java Ex4
 * 
 * @author: Jing Xu
 ***************************************/

public class Ex4
{
    public static void main(String[] args)
    {
        String string1 = "hello";
        String string2 = string1;
        string1 = "world";
        StdOut.println(string1);
        StdOut.println(string2);
    }
}