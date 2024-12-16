import java.util.*;

public class Umit_checkers
{
    public static String gameboard(Piece[] white, Piece[] black)
    {
        String game = "";
        for(int i = 0; i <= 7; i++)
        {
            for(int j = 0; j <= 7; j++)
                {
                    String check = "";
                    for(int p = 0; p < white.length; p++)
                    {

                        if (j == white[p].getX() && white[p].getY() == i && !white[p].isDead() && !white[p].kingStatus())
                        {
                            check = "white";
                        }
                        else if(j == black[p].getX() && black[p].getY() == i && !black[p].isDead() && !black[p].kingStatus())
                        {
                            check = "black";
                        }
                        else if (j == white[p].getX() && white[p].getY() == i && !white[p].isDead() && white[p].kingStatus())
                        {
                            check = "White";
                        }
                        else if(j == black[p].getX() && black[p].getY() == i && !black[p].isDead() && black[p].kingStatus())
                        {
                            check = "Black";
                        }
                    }
                    if(check.equals("white")) {
                        game += ("| w |");
                    }
                    else if(check.equals("black")) {
                        game += ("| b |");
                    }
                    else if(check.equals("White")) {
                        game += ("| W |");
                    }
                    else if(check.equals("Black")) {
                        game += ("| B |");
                    }
                    else {
                        game += ("|   |");
                    }

                }
            game += ((i+1) + "\n");
        }
        game += "  1    2    3    4    5    6    7    8  ";
        return game;
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Piece[] white = {new Piece(1,0), new Piece(1,1), new Piece(1,2), new Piece(1,3), new Piece(1,4),new Piece(1,5),new Piece(1,6), new Piece(1,7),
                new Piece(2,0), new Piece(2,1), new Piece(2,2), new Piece(2,3), new Piece(2,4),new Piece(2,5),new Piece(2,6), new Piece(2,7)};

        Piece[] black = {new Piece(5,0), new Piece(5,1), new Piece(5,2), new Piece(5,3), new Piece(5,4),new Piece(5,5),new Piece(5,6), new Piece(5,7),
                new Piece(6,0), new Piece(6,1), new Piece(6,2), new Piece(6,3), new Piece(6,4),new Piece(6,5),new Piece(6,6), new Piece(6,7)};

        boolean playing = true;
        int turn_counter = 1;

        while(playing)
        {
            if(turn_counter % 2 == 1)
            {
                System.out.println(gameboard(white,black));
                System.out.println("White Playing");

                boolean false_move = true;
                int playing_peice = 17;
                while(false_move)
                {

                    boolean false_piece = true;
                    while(false_piece) {
                        System.out.println("What is the x value of the piece would you like to move");
                        int x_move = input.nextInt();
                        input.nextLine();
                        System.out.println("What is the y value of the piece would you like to move");
                        int y_move = input.nextInt();
                        input.nextLine();
                        for (int holder = 1; holder <= white.length; holder ++) {
                            if (x_move - 1 == white[holder-1].getX() && y_move - 1 == white[holder-1].getY()) {
                                playing_peice = holder - 1;
                            }
                        }
                        if (playing_peice == 17)
                        {
                            System.out.println("Not a valid piece");
                        }
                        else
                            false_piece = false;
                    }
                    System.out.println("What is the x value that would you like to move the piece to");
                    int x_move = input.nextInt() - 1;
                    input.nextLine();
                    System.out.println("What is the y value that would you like to move the piece to");
                    int y_move = input.nextInt() - 1;
                    input.nextLine();
                    boolean incorect_move = false;
                    for(int counter = 0; counter < white.length; counter ++) {
                        if (x_move > 8 || y_move > 8)
                            incorect_move = true;
                        else if(x_move < white[playing_peice].getX() && !white[playing_peice].kingStatus())
                            incorect_move = true;
                        else if( x_move != white[playing_peice].getX() && y_move != white[playing_peice].getY())
                            incorect_move = true;
                        else if((black[counter].getX() == x_move && black[counter].getY() == y_move) || (white[counter].getX() == x_move && white[counter].getY() == y_move))
                            incorect_move = true;
                    }
                    boolean capture = false;
                    int hold = 0;
                    for(int counter = 0; counter < white.length; counter ++) {
                        if(black[counter].getY() == white[playing_peice].getY() && ((x_move + 1 == black[counter].getX() && black[counter].getX() < white[playing_peice].getX()) || (x_move - 1 == black[counter].getX() && black[counter].getX() > white[playing_peice].getX()))){
                            capture = true;
                            hold = counter;
                        }
                        else if(black[counter].getX() == white[playing_peice].getX() && ((y_move + 1 == black[counter].getY() && black[counter].getY() < white[playing_peice].getY()) || (y_move - 1 == black[counter].getY() && black[counter].getY() > white[playing_peice].getY()))){
                            capture = true;
                            hold = counter;
                        }
                    }

                    if((!capture && x_move - 1 > white[playing_peice].getX() && !white[playing_peice].kingStatus()) || (!capture && (y_move - 1 > white[playing_peice].getY() || y_move + 1 < white[playing_peice].getY()) && !white[playing_peice].kingStatus()))
                    {
                        incorect_move = true;
                    }
                    if((!white[playing_peice].kingStatus() && x_move - 2 > white[playing_peice].getX()) || ((y_move - 2 > white[playing_peice].getY() || y_move + 2 < white[playing_peice].getY()) && !white[playing_peice].kingStatus()))
                        incorect_move = true;
                    if(!incorect_move && capture)
                    {
                        black[hold].setDead(true);
                        white[playing_peice].setX(x_move);
                        white[playing_peice].setY(y_move);
                        false_move = false;
                        turn_counter ++;
                        if(white[playing_peice].getX() == 7)
                            white[playing_peice].makeKing();
                        else{
                            System.out.println("do you see another kill possible(y/n)?");
                            String choose = input.nextLine();
                            if(choose.equals("y"))
                                turn_counter ++;
                        }


                    }
                    else if(!incorect_move)
                    {
                        white[playing_peice].setX(x_move);
                        white[playing_peice].setY(y_move);
                        false_move = false;
                        turn_counter ++;
                        if(white[playing_peice].getX() == 7)
                            white[playing_peice].makeKing();
                    }
                    else if(incorect_move){
                        System.out.println("That is an illegal move");
                    }
                }
            }

            int game_end_white = 0;
            int game_end_black = 0;
            for(Piece whiter:white)
            {
                if(whiter.isDead())
                    game_end_white ++;
            }
            for(Piece blacker:black)
            {
                if(blacker.isDead())
                    game_end_black ++;
            }
            if(game_end_white == 16){
                System.out.println("Black Wins");
                playing = false;
            }
            if(game_end_black == 16){
                System.out.println("White Wins");
                playing = false;
            }



            else if(turn_counter % 2 == 0)
            {
                System.out.println(gameboard(white,black));
                System.out.println("Black Playing");
                boolean false_move = true;
                int playing_peice = 17;
                while(false_move)
                {

                    boolean false_piece = true;
                    while(false_piece) {
                        System.out.println("What is the x value of the piece would you like to move");
                        int x_move = input.nextInt();
                        input.nextLine();
                        System.out.println("What is the y value of the piece would you like to move");
                        int y_move = input.nextInt();
                        input.nextLine();
                        for (int holder = 1; holder <= black.length; holder ++) {
                            if (x_move - 1 == black[holder-1].getX() && y_move - 1 == black[holder-1].getY()) {
                                playing_peice = holder - 1;
                            }
                        }
                        if (playing_peice == 17)
                        {
                            System.out.println("Not a valid piece");
                        }
                        else
                            false_piece = false;
                    }
                    System.out.println("What is the x value that would you like to move the piece to");
                    int x_move = input.nextInt() - 1;
                    input.nextLine();
                    System.out.println("What is the y value that would you like to move the piece to");
                    int y_move = input.nextInt() - 1;
                    input.nextLine();
                    boolean incorect_move = false;
                    for(int counter = 0; counter < black.length; counter ++) {
                        if (x_move > 8 || y_move > 8)
                            incorect_move = true;
                        else if(x_move > black[playing_peice].getX() && !black[playing_peice].kingStatus())
                            incorect_move = true;
                        else if( x_move != black[playing_peice].getX() && y_move != black[playing_peice].getY())
                            incorect_move = true;
                        else if((black[counter].getX() == x_move && black[counter].getY() == y_move) || (black[counter].getX() == x_move && black[counter].getY() == y_move))
                            incorect_move = true;
                    }
                    boolean capture = false;
                    int hold = 0;
                    for(int counter = 0; counter < black.length; counter ++) {
                        if(white[counter].getY() == black[playing_peice].getY() && ((x_move + 1 == white[counter].getX() && white[counter].getX() < black[playing_peice].getX()) || (x_move - 1 == white[counter].getX() && white[counter].getX() > black[playing_peice].getX()))){
                            capture = true;
                            hold = counter;
                        }
                        else if(white[counter].getX() == black[playing_peice].getX() && ((y_move + 1 == white[counter].getY() && white[counter].getY() < black[playing_peice].getY()) || (y_move - 1 == white[counter].getY() && white[counter].getY() > black[playing_peice].getY()))){
                            capture = true;
                            hold = counter;
                        }
                    }

                    if((!capture && x_move + 1 < black[playing_peice].getX() && !black[playing_peice].kingStatus()) || (!capture && (y_move - 1 > black[playing_peice].getY() || y_move + 1 < black[playing_peice].getY()) && !black[playing_peice].kingStatus()))
                    {
                        incorect_move = true;
                    }
                    if((!black[playing_peice].kingStatus() && x_move + 2 < black[playing_peice].getX()) || ((y_move - 2 > black[playing_peice].getY() || y_move + 2 < black[playing_peice].getY()) && !black[playing_peice].kingStatus()))
                        incorect_move = true;
                    if(!incorect_move && capture)
                    {
                        white[hold].setDead(true);
                        black[playing_peice].setX(x_move);
                        black[playing_peice].setY(y_move);
                        false_move = false;
                        turn_counter ++;
                        if(black[playing_peice].getX() == 7)
                            black[playing_peice].makeKing();
                        else{
                            System.out.println("do you see another kill possible(y/n)?");
                            String choose = input.nextLine();
                            if(choose.equals("y"))
                                turn_counter ++;
                        }
                    }
                    else if(!incorect_move)
                    {
                        black[playing_peice].setX(x_move);
                        black[playing_peice].setY(y_move);
                        false_move = false;
                        turn_counter ++;
                        if(black[playing_peice].getX() == 7)
                            black[playing_peice].makeKing();
                    }
                    else if(incorect_move){
                        System.out.println("That is an illegal move");
                    }
                }
            }
        }


    }
}
