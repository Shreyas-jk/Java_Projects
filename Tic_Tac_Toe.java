import java.util.*;
public class Tic_Tac_toe_Arrays
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String[][] grid = { {"1","2","3"} , {"4","5","6"},{"7","8","9"}};
        boolean cont = true;
        int counter = 1;
        while (cont)
        {
            if (counter % 2 == 1)
            {
                System.out.println(" " + grid[0][0] + " | " + grid[0][1] + " | " + grid[0][2] + " ");
                System.out.println("------------");
                System.out.println(" " + grid[1][0] + " | " + grid[1][1] + " | " + grid[1][2] + " ");
                System.out.println("------------");
                System.out.println(" " + grid[2][0] + " | " + grid[2][1] + " | " + grid[2][2] + " ");
                System.out.println("Player 1 Please Give me a number to pick:");
                String catcher = input.nextLine();

                boolean catcher_check = false;
                if(catcher.equals("O") || catcher.equals("X"))
                    catcher_check = true;
                while (catcher_check)
                {
                    System.out.println(" " + grid[0][0] + " | " + grid[0][1] + " | " + grid[0][2] + " ");
                    System.out.println("------------");
                    System.out.println(" " + grid[1][0] + " | " + grid[1][1] + " | " + grid[1][2] + " ");
                    System.out.println("------------");
                    System.out.println(" " + grid[2][0] + " | " + grid[2][1] + " | " + grid[2][2] + " ");
                    System.out.println("Player 1 Please Give me a NUMBER to pick YOU FILTHY CHEATER:");
                    catcher = input.nextLine();
                    if(catcher.equals("O") || catcher.equals("X"))
                        catcher_check = true;
                    else
                        catcher_check = false;
                }

                if(catcher.equals(grid [0][0]))
                {
                    grid[0][0] = "O";
                }
                else if(catcher.equals(grid [0][1]))
                {
                    grid[0][1] = "O";
                }
                else if(catcher.equals(grid [0][2]))
                {
                    grid[0][2] = "O";
                }
                else if(catcher.equals(grid [1][0]))
                {
                    grid[1][0] = "O";
                }
                else if(catcher.equals(grid [1][1]))
                {
                    grid[1][1] = "O";
                }
                else if(catcher.equals(grid [1][2]))
                {
                    grid[1][2] = "O";
                }
                else if(catcher.equals(grid [2][0]))
                {
                    grid[2][0] = "O";
                }
                else if(catcher.equals(grid [2][1]))
                {
                    grid[2][1] = "O";
                }
                else if(catcher.equals(grid [2][2]))
                {
                    grid[2][2] = "O";
                }
                else
                {
                    System.out.println("I guess player one cannot follow simple instructions, their turn is now void dumbo");
                }
            }

            if (counter % 2 == 0)
            {
                System.out.println(" " + grid[0][0] + " | " + grid[0][1] + " | " + grid[0][2] + " ");
                System.out.println("------------");
                System.out.println(" " + grid[1][0] + " | " + grid[1][1] + " | " + grid[1][2] + " ");
                System.out.println("------------");
                System.out.println(" " + grid[2][0] + " | " + grid[2][1] + " | " + grid[2][2] + " ");
                System.out.println("Player 2 Please Give me a number to pick:");
                String catcher = input.nextLine();

                boolean catcher_check = false;
                if(catcher.equals("O") || catcher.equals("X"))
                    catcher_check = true;
                while (catcher_check)
                {
                    System.out.println(" " + grid[0][0] + " | " + grid[0][1] + " | " + grid[0][2] + " ");
                    System.out.println("------------");
                    System.out.println(" " + grid[1][0] + " | " + grid[1][1] + " | " + grid[1][2] + " ");
                    System.out.println("------------");
                    System.out.println(" " + grid[2][0] + " | " + grid[2][1] + " | " + grid[2][2] + " ");
                    System.out.println("Player 2 Please Give me a NUMBER to pick YOU FILTHY CHEATER:");
                    catcher = input.nextLine();
                    if(catcher.equals("O") || catcher.equals("X"))
                        catcher_check = true;

                }

                if(catcher.equals(grid [0][0]))
                {
                    grid[0][0] = "X";
                }
                else if(catcher.equals(grid [0][1]))
                {
                    grid[0][1] = "X";
                }
                else if(catcher.equals(grid [0][2]))
                {
                    grid[0][2] = "X";
                }
                else if(catcher.equals(grid [1][0]))
                {
                    grid[1][0] = "X";
                }
                else if(catcher.equals(grid [1][1]))
                {
                    grid[1][1] = "X";
                }
                else if(catcher.equals(grid [1][2]))
                {
                    grid[1][2] = "X";
                }
                else if(catcher.equals(grid [2][0]))
                {
                    grid[2][0] = "X";
                }
                else if(catcher.equals(grid [2][1]))
                {
                    grid[2][1] = "X";
                }
                else if(catcher.equals(grid [2][2]))
                {
                    grid[2][2] = "X";
                }
                else
                {
                    System.out.println("I guess player two cannot follow simple instructions, their turn is now void dumbo");
                }
            }


            if( (grid[0][0].equals(grid[0][1]) && grid[0][1].equals(grid[0][2]) && grid[0][0].equals("X")) || (grid[1][0].equals(grid[1][1]) && grid[1][1].equals(grid[1][2]) && grid[1][0].equals("X")) ||(grid[2][0].equals(grid[2][1]) && grid[2][1].equals(grid[2][2]) && grid[2][0].equals("X")) ||(grid[0][0].equals(grid[1][1]) && grid[1][1].equals(grid[2][2]) && grid[0][0].equals("X")) ||(grid[2][0].equals(grid[1][1]) && grid[1][1].equals(grid[0][2]) && grid[2][0].equals("X")) ||(grid[0][0].equals(grid[1][0]) && grid[1][0].equals(grid[2][0]) && grid[0][0].equals("X")) ||(grid[0][1].equals(grid[1][1]) && grid[1][1].equals(grid[2][1]) && grid[0][1].equals("X")) ||(grid[0][2].equals(grid[1][2]) && grid[1][2].equals(grid[2][2]) && grid[0][2].equals("X")))
            {
                System.out.println(" " + grid[0][0] + " | " + grid[0][1] + " | " + grid[0][2] + " ");
                System.out.println("------------");
                System.out.println(" " + grid[1][0] + " | " + grid[1][1] + " | " + grid[1][2] + " ");
                System.out.println("------------");
                System.out.println(" " + grid[2][0] + " | " + grid[2][1] + " | " + grid[2][2] + " ");
                System.out.println("\nPlayer 2 wins");
                cont = false;
            }
            if( (grid[0][0].equals(grid[0][1]) && grid[0][1].equals(grid[0][2]) && grid[0][0].equals("O")) || (grid[1][0].equals(grid[1][1]) && grid[1][1].equals(grid[1][2]) && grid[1][0].equals("O")) ||(grid[2][0].equals(grid[2][1]) && grid[2][1].equals(grid[2][2]) && grid[2][0].equals("O")) ||(grid[0][0].equals(grid[1][1]) && grid[1][1].equals(grid[2][2]) && grid[0][0].equals("O")) ||(grid[2][0].equals(grid[1][1]) && grid[1][1].equals(grid[0][2]) && grid[2][0].equals("O")) ||(grid[0][0].equals(grid[1][0]) && grid[1][0].equals(grid[2][0]) && grid[0][0].equals("O")) ||(grid[0][1].equals(grid[1][1]) && grid[1][1].equals(grid[2][1]) && grid[0][1].equals("O")) ||(grid[0][2].equals(grid[1][2]) && grid[1][2].equals(grid[2][2]) && grid[0][2].equals("O")))
            {
                System.out.println(" " + grid[0][0] + " | " + grid[0][1] + " | " + grid[0][2] + " ");
                System.out.println("------------");
                System.out.println(" " + grid[1][0] + " | " + grid[1][1] + " | " + grid[1][2] + " ");
                System.out.println("------------");
                System.out.println(" " + grid[2][0] + " | " + grid[2][1] + " | " + grid[2][2] + " ");
                System.out.println("\nPlayer 1 wins");
                cont = false;
            }
            if( (grid[0][0].equals("X") || grid[0][0].equals("O")) && (grid[0][1].equals("X") || grid[0][1].equals("O")) && (grid[0][2].equals("X") || grid[0][2].equals("O")) && (grid[1][0].equals("X") || grid[1][0].equals("O")) && (grid[1][1].equals("X") || grid[1][1].equals("O")) && (grid[1][2].equals("X") || grid[1][2].equals("O")) && (grid[2][0].equals("X") || grid[2][0].equals("O")) && (grid[2][1].equals("X") || grid[2][1].equals("O")) && (grid[2][2].equals("X") || grid[2][2].equals("O")))
            {
                System.out.println("It's a draw");
                cont = false;
                System.out.println(" " + grid[0][0] + " | " + grid[0][1] + " | " + grid[0][2] + " ");
                System.out.println("------------");
                System.out.println(" " + grid[1][0] + " | " + grid[1][1] + " | " + grid[1][2] + " ");
                System.out.println("------------");
                System.out.println(" " + grid[2][0] + " | " + grid[2][1] + " | " + grid[2][2] + " ");
            }

            counter ++;
        }
    }
}
