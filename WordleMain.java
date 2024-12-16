import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class WordleMain {
    public static void main(String[] args) {

        ArrayList<String> allWords = new ArrayList<String>();
        try {
            File myObj = new File("wordle.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                allWords.add(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        Scanner input = new Scanner(System.in);
        Random random = new Random();
        String randomWord = allWords.get(random.nextInt(allWords.size()));


        String[] letters = {randomWord.substring(0,1), randomWord.substring(1,2), randomWord.substring(2,3), randomWord.substring(3,4), randomWord.substring(4)};
        wordleObject wordle = new wordleObject(letters);


        System.out.println("Welcome to wordle");

        int guesses = 6;
        while(guesses > 0)
        {
            System.out.println("Remaining alphabet: " + wordle.getAlphabet());
            System.out.println("Please make a guess:");
            String player_guess = input.nextLine();
            String[] player_letters = {player_guess.substring(0,1), player_guess.substring(1,2), player_guess.substring(2,3), player_guess.substring(3,4), player_guess.substring(4)};
            boolean exists = false;
            int count = 0;
            for(String word: allWords)
            {
                if(player_guess.equals(word))
                    count ++;
                else
                    count += 0;
            }
            if(count > 0)
                exists = true;
            if(!exists || player_guess.length() > 6)
            {
                System.out.println("Please try another word");
            }
            else
            {

                for(String q:player_letters)
                {
                    boolean exist = false;
                    for(String p: letters)
                    {
                        if (q.equals(p))
                        {
                            exist = true;
                        }
                    }
                    for(int i = 0; i <= wordle.getAlphabet().size() - 1 ;i ++)
                    {
                        if(q.equals(wordle.getAlphabet().get(i)) && !exist)
                        {
                            wordle.getAlphabet().remove(i);
                        }
                    }
                }
                int counter = 0;
                for(String q:player_letters)
                {
                    for(String p:letters)
                    {
                        if(p.equals(q))
                            counter ++;
                    }
                }

                if (counter == 5)
                {
                    guesses = 0;
                    System.out.println("You win");
                }
                else
                {
                    guesses -= 1;
                    System.out.println("Try again");
                }
                

            }
        }
    }
}