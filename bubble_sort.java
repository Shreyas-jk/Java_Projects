import java.util.*;
public class bubble_sort
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int[] sort = new int[10];
        System.out.println("Give me the first number:");
        sort[0] = input.nextInt();
        System.out.println("Give me the second number:");
        sort[1] = input.nextInt();
        System.out.println("Give me the third number:");
        sort[2] = input.nextInt();
        System.out.println("Give me the fourth number:");
        sort[3] = input.nextInt();
        System.out.println("Give me the fifth number:");
        sort[4] = input.nextInt();
        System.out.println("Give me the sixth number:");
        sort[5] = input.nextInt();
        System.out.println("Give me the seventh number:");
        sort[6] = input.nextInt();
        System.out.println("Give me the eighth number:");
        sort[7] = input.nextInt();
        System.out.println("Give me the ninth number:");
        sort[8] = input.nextInt();
        System.out.println("Give me the tenth number:");
        sort[9] = input.nextInt();

        int holder;
        for(int counter = 0; counter < 10; counter++)
        {
            for(int bubble = 0; bubble < 9; bubble ++)
            {
                if (sort[bubble] > sort[bubble + 1])
                {
                    holder = sort[bubble + 1];
                    sort[bubble + 1] = sort[bubble];
                    sort[bubble] = holder;
                }
            }
        }
        System.out.println("\nThe sorted list is " + sort[0] + ", " + sort[1] + ", " + sort[2] + ", " + sort[3] + ", " + sort[4] + ", " + sort[5] + ", " + sort[6] + ", " + sort[7] + ", " + sort[8] + ", " + sort[9]);
    }
}
