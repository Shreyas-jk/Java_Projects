import java.sql.SQLOutput;
import java.util.*;
public class Pascals_triangle
{
    public static String list_printer(int[] a)
    {
        String b = "";
        for(int i = 0; i < a.length; i++)
        {
            if(a[i] != 0)
            {
                b = b + a[i] + " ";
            }
        }
        return b;
    }
    public static int[] copy(int[] a, int[]b)
    {
        for(int copy = 0; copy < a.length; copy ++)
        {
            b[copy] = a[copy];
        }
        return b;
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please give me a number");
        int level = input.nextInt();
        input.nextLine();
        int[] a = new int[level];
        a[0] = 1;
        for(int lev = 0; lev < level; lev ++)
        {
            int[] b = new int[level];
            b = copy(a,b);
            for (int i = 1; i < lev + 1; i++)
            {
                a[i] = b[i - 1] + b[i];
            }
            System.out.println(list_printer(a));
        }
    }
}
