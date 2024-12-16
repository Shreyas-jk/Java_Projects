import java.util.*;
public class Black_Jack
{
    public static int random_card(Cards[] deck)
    {
        double e = Math.random();
        e = e * deck.length;
        int b = 0;
        boolean yes = true;
        while (yes)
        {
            for(int banana = 0; banana < e; banana ++)
            {
                if(banana < e && e < banana + 1)
                {
                    b = banana;
                    yes = false;
                }
            }
        }
        return b;
    }
    public static Cards[] deck_remove(Cards[] deck, int d)
    {
        Cards[] deck_holder = new Cards[deck.length];


        for(int i = 0; i < deck.length; i ++)
            deck_holder[i] = deck[i];
        deck = new Cards[deck_holder.length - 1];
        for(int i = 0; i < d; i ++)
        {
            deck[i] = deck_holder[i];
        }
        for(int i = d; i < deck_holder.length - 1; i ++)
        {
            deck[i] = deck_holder[i + 1];
        }
        return deck;
    }
    public static void game_output(Cards[] a, Cards[] b)
    {
        System.out.println("Dealer Hand:");
        for(int i = 0; i < a.length - 1; i ++)
        {
            System.out.print(a[i].getNumber_name() + ", ");
        }
        System.out.println(a[a.length - 1].getNumber_name());
        System.out.println("\n\n\n");
        System.out.println("Player Hand:");
        for(int i = 0; i < b.length - 1; i ++)
        {
            System.out.print(b[i].getNumber_name() + ", ");
        }
        System.out.println(b[b.length - 1].getNumber_name());

    }
    public static void ace_check(Cards[] a)
    {
        int hand_value = 0;
        for(int i = 0; i < a.length; i++)
        {
            hand_value += a[i].getNumber();
        }
        for(int i = 0; i < a.length; i++)
        {
            if(hand_value > 21 && a[i].getNumber() == 11)
            {
                a[i].setNumber(1);
            }
        }

    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        boolean game = true;
        while (game)
        {
            Cards[] deck = {new Cards(2,"Hearts","2 of Hearts"),
                    new Cards(3,"Hearts","3 of Hearts"),
                    new Cards(4,"Hearts","4 of Hearts"),
                    new Cards(5,"Hearts","5 of Hearts"),
                    new Cards(6,"Hearts","6 of Hearts"),
                    new Cards(7,"Hearts","7 of Hearts"),
                    new Cards(8,"Hearts","8 of Hearts"),
                    new Cards(9,"Hearts","9 of Hearts"),
                    new Cards(10,"Hearts","10 of Hearts"),
                    new Cards(10,"Hearts","Jack of Hearts"),
                    new Cards(10,"Hearts","Queen of Hearts"),
                    new Cards(10,"Hearts","King of Hearts"),
                    new Cards(11,"Hearts","Ace of Hearts"),
                    new Cards(2,"Spades","2 of Spades"),
                    new Cards(3,"Spades","3 of Spades"),
                    new Cards(4,"Spades","4 of Spades"),
                    new Cards(5,"Spades","5 of Spades"),
                    new Cards(6,"Spades","6 of Spades"),
                    new Cards(7,"Spades","7 of Spades"),
                    new Cards(8,"Spades","8 of Spades"),
                    new Cards(9,"Spades","9 of Spades"),
                    new Cards(10,"Spades","10 of Spades"),
                    new Cards(10,"Spades","Jack of Spades"),
                    new Cards(10,"Spades","Queen of Spades"),
                    new Cards(10,"Spades","King of Spades"),
                    new Cards(11,"Spades","Ace of Spades"),
                    new Cards(2,"Clubs","2 of Clubs"),
                    new Cards(3,"Clubs","3 of Clubs"),
                    new Cards(4,"Clubs","4 of Clubs"),
                    new Cards(5,"Clubs","5 of Clubs"),
                    new Cards(6,"Clubs","6 of Clubs"),
                    new Cards(7,"Clubs","7 of Clubs"),
                    new Cards(8,"Clubs","8 of Clubs"),
                    new Cards(9,"Clubs","9 of Clubs"),
                    new Cards(10,"Clubs","10 of Clubs"),
                    new Cards(10,"Clubs","Jack of Clubs"),
                    new Cards(10,"Clubs","Queen of Clubs"),
                    new Cards(10,"Clubs","King of Clubs"),
                    new Cards(11,"Clubs","Ace of Clubs"),
                    new Cards(2,"Diamonds","2 of Diamonds"),
                    new Cards(3,"Diamonds","3 of Diamonds"),
                    new Cards(4,"Diamonds","4 of Diamonds"),
                    new Cards(5,"Diamonds","5 of Diamonds"),
                    new Cards(6,"Diamonds","6 of Diamonds"),
                    new Cards(7,"Diamonds","7 of Diamonds"),
                    new Cards(8,"Diamonds","8 of Diamonds"),
                    new Cards(9,"Diamonds","9 of Diamonds"),
                    new Cards(10,"Diamonds","10 of Diamonds"),
                    new Cards(10,"Diamonds","Jack of Diamonds"),
                    new Cards(10,"Diamonds","Queen of Diamonds"),
                    new Cards(10,"Diamonds","King of Diamonds"),
                    new Cards(11,"Diamonds","Ace of Diamonds")};
            int bank = 1000;
            Cards[] dealer_hand = new Cards[2];
            for(int i = 0; i < 2; i++)
            {
                int random = random_card(deck);
                dealer_hand[i] = deck[random];
                Cards[] deck_holder = new Cards[deck.length];
                for(int j = 0; j < deck.length; j ++)
                {
                    deck_holder[j] = deck[j];
                }
                deck = new Cards[deck_holder.length - 1];
                for(int k = 0; k < deck.length; k++)
                {
                    deck[k] = deck_remove(deck_holder,random)[k];
                }
            }
            Cards[] player_hand = new Cards[2];
            for(int i = 0; i < 2; i++)
            {
                int random = random_card(deck);
                player_hand[i] = deck[random];
                Cards[] deck_holder = new Cards[deck.length];
                for(int j = 0; j < deck.length; j ++)
                {
                    deck_holder[j] = deck[j];
                }
                deck = new Cards[deck_holder.length - 1];
                for(int k = 0; k < deck.length; k++)
                {
                    deck[k] = deck_remove(deck_holder,random)[k];
                }
            }
            game_output(dealer_hand,player_hand);
            System.out.println("How much would you like to bet:");
            int bet = input.nextInt();
            input.nextLine();
            boolean charge = false;
            if(bet > bank)
                charge = true;
            while(charge)
            {
                System.out.println("You do not have the much money. You have " + bank +". How much would you like to bet:");
                bet = input.nextInt();
                if(bet > bank)
                    charge = false;
            }
            bank -= bet;
            boolean chooses = true;
            while (chooses) {
                System.out.println("Would you like to hit(y/n):");
                String choice = input.nextLine();
                if (choice.equals("y"))
                {

                    int random = random_card(deck);
                    Cards[] player_holder = new Cards[player_hand.length];
                    for(int i = 0; i < player_hand.length; i++)
                        player_holder[i] = player_hand[i];
                    player_hand = new Cards[player_holder.length + 1];
                    for(int i = 0; i < player_holder.length; i++)
                        player_hand[i] = player_holder[i];
                    player_hand[player_hand.length - 1] = deck[random];
                    Cards[] deck_holder = new Cards[deck.length];
                    for(int j = 0; j < deck.length; j ++)
                    {
                        deck_holder[j] = deck[j];
                    }
                    deck = new Cards[deck_holder.length - 1];
                    for(int k = 0; k < deck.length; k++)
                    {
                        deck[k] = deck_remove(deck_holder,random)[k];
                    }
                }
                else if(choice.equals("n"))
                    chooses = false;
                for(int i = 1; i <= 4; i++)
                    ace_check(player_hand);
                game_output(dealer_hand,player_hand);
            }
            int player_value = 0;
            for(int i = 0; i < player_hand.length; i ++)
            {
                player_value += player_hand[i].getNumber();
            }

            int dealer_hand_value = dealer_hand[0].getNumber() + dealer_hand[1].getNumber();
            while(dealer_hand_value <= 17 )
            {
                int random = random_card(deck);
                Cards[] dealer_holder = new Cards[dealer_hand.length];
                for(int i = 0; i < dealer_hand.length; i++)
                    dealer_holder[i] = dealer_hand[i];
                dealer_hand = new Cards[dealer_holder.length + 1];
                for(int i = 0; i < dealer_hand.length - 1; i++)
                    dealer_hand[i] = dealer_holder[i];
                dealer_hand[dealer_hand.length - 1] = deck[random];
                Cards[] deck_holder = new Cards[deck.length];
                for(int j = 0; j < deck.length; j ++)
                {
                    deck_holder[j] = deck[j];
                }
                deck = new Cards[deck_holder.length - 1];
                for(int k = 0; k < deck.length; k++)
                {
                    deck[k] = deck_remove(deck_holder,random)[k];
                }
                dealer_hand_value += dealer_hand[dealer_hand.length - 1].getNumber();
                for(int i = 1; i <= 4; i++)
                    ace_check(dealer_hand);
            }

            game_output(dealer_hand,player_hand);

            if ((player_value > 21 && dealer_hand_value > 21) || player_value == dealer_hand_value)
            {
                bank += bet;
                System.out.println("Draw game");
            }
            else if (player_value > 21)
            {
                System.out.println("Dealer wins");
            }
            else if (dealer_hand_value > 21)
            {
                bank += 2* bet;
                System.out.println("You win");
            }
            else if(player_value > dealer_hand_value)
            {
                bank += 2* bet;
                System.out.println("You win");
            }
            else if (player_value < dealer_hand_value)
            {
                System.out.println("Dealer wins");
            }
            System.out.println("Would you like to keep playing(y/n):");
            String Game = input.nextLine();
            if(Game.equals("n"))
                game = false;
            if (bank <= 0 )
            {
                System.out.println("You ran out of money");
                game = false;
            }

        }




        
    }
}
