/*********************************************
 *  Compilation:  javac Ex11.java
 * 
 *  exercises 1.1.11
 *  
 *  Output boolean table 
 *  use * to replace true, ' ' to replace false
 *  
 *********************************************/

/*
 * @author Jing Xu
 * 
 * */

public class Ex11
{
    public static void main(String[] args)
    {
        boolean[][] a = new boolean[][] {
            {true, true, true, false, false, true},
            {false, true, false, true, true, true},
            {true, false, false, true, true, true},
            {true, false, false, true, false, false}
        };
        
        for(int row = 0; row < 4; row++)
        {
            for(int column = 0; column < 6; column++)
            {
                if(row == 0)
                    System.out.print(column);
                else if (column == 0)
                    System.out.print(row);
                else if(a[row - 1][column - 1])
                    System.out.print('*');
                else
                    System.out.print(' ');
            }
            System.out.print('\n');
        }
    }
}