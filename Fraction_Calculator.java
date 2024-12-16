import java.util.*;
public class Fraction_calc_methods
{
    public static void main(String[] args)
    {
        System.out.println("Shreyas Kiran's Fraction Calculator");
        Scanner input = new Scanner(System.in);
        boolean yes = true;
        while (yes)
        {
            System.out.println("Please selection your operation\n" +
                    "1. Addition\n" +
                    "2. Subtraction\n" +
                    "3. Multiplication\n" +
                    "4. Division\n" +
                    "5. Just Simplify a fraction");
            int choice = input.nextInt();
            input.nextLine();

            System.out.println("Please enter the first numerator:");
            int first_num = input.nextInt();
            input.nextLine();

            System.out.println("Please enter the first denominator:");
            int first_dem = input.nextInt();
            input.nextLine();



            int num_holder = first_num;
            int dem_holder = first_dem;

            if (choice == 1)
            {
                System.out.println("Please enter the second numerator:");
                int second_num = input.nextInt();
                input.nextLine();

                System.out.println("Please enter the second denominator:");
                int second_dem = input.nextInt();
                input.nextLine();

                adder(first_num,first_dem,second_num,second_dem,num_holder,dem_holder);
            }

            else if (choice == 2)
            {
                System.out.println("Please enter the second numerator:");
                int second_num = input.nextInt();
                input.nextLine();

                System.out.println("Please enter the second denominator:");
                int second_dem = input.nextInt();
                input.nextLine();

                subber(first_num, first_dem, second_num, second_dem, num_holder, dem_holder);
            }
            else if (choice == 3)
            {
                System.out.println("Please enter the second numerator:");
                int second_num = input.nextInt();
                input.nextLine();

                System.out.println("Please enter the second denominator:");
                int second_dem = input.nextInt();
                input.nextLine();

                multiplier(first_num,first_dem,second_num,second_dem,num_holder,dem_holder);
            }
            else if (choice == 4)
            {
                System.out.println("Please enter the second numerator:");
                int second_num = input.nextInt();
                input.nextLine();

                System.out.println("Please enter the second denominator:");
                int second_dem = input.nextInt();
                input.nextLine();

                divider(first_num,first_dem,second_num,second_dem,num_holder,dem_holder);
            }
            else if (choice == 5)
                simplifier(num_holder, dem_holder);


            System.out.println("Do you want to continue (y/n):");
            String apples = input.nextLine();
            if (apples.equals("n"))
            {
                yes = false;
            }
        }
        System.out.println("Thank you for using our service");
    }
    public static void adder(int x, int y, int w, int z, int num_holder, int dem_holder)
    {
        num_holder = (x * z) + (y * w);
        dem_holder = y * z;
        simplifier(num_holder,dem_holder);

    }
    public static void subber(int x, int y, int w, int z, int num_holder, int dem_holder)
    {
        num_holder = (x * z) - (y * w);
        dem_holder = y * z;
        simplifier(num_holder,dem_holder);
    }
    public static void multiplier(int x, int y, int w, int z, int num_holder, int dem_holder)
    {
        num_holder = x * w;
        dem_holder = y * z;
        simplifier(num_holder,dem_holder);
    }
    public static void divider(int x, int y, int w, int z, int num_holder, int dem_holder)
    {
        num_holder = x * z;
        dem_holder = y * w;
        simplifier(num_holder,dem_holder);
    }
    public static void simplifier(int num_holder, int dem_holder)
    {
        for(int prime = 2; prime <= dem_holder; prime++)
        {
            while(dem_holder % prime == 0 && num_holder % prime == 0)
            {
                num_holder = num_holder / prime;
                dem_holder = dem_holder / prime;
            }
        }
        System.out.println(num_holder + "/" + dem_holder);
    }
}