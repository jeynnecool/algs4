/***************************************
 *  Compilation:  javac Ex3.java
 * 
 *  exercises 1.1.3
 *
 ***************************************/

/*
 * @author Jing Xu
 * 
 * */

public class Ex3
{
    public static void main(String[] args)
    {
        System.out.println("Enter first integer: ");
        int num1 = Integer.parseInt(System.console().readLine());
        System.out.println("Enter second integer: ");
        int num2 = Integer.parseInt(System.console().readLine());
        System.out.println("Enter third integer: ");
        int num3 = Integer.parseInt(System.console().readLine());
        
        System.out.println(num1 == num2 && num1 == num3 && num2 == num3);
    }
}
