import java.util.ArrayList;

public class wordleObject {
    private String[] letters;
    private ArrayList<String> alphabet;

    public wordleObject(String[] letters) {
        this.letters = letters;
        alphabet = new ArrayList<String>();
        String[] x = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        for (String temp : x)
            alphabet.add(temp);
    }


    public String[] getLetters() {
        return letters;
    }

    public ArrayList<String> getAlphabet() {
        return alphabet;
    }

    // Method to update the alphabet based on a guessed letter
    public void updateAlphabet(String guessedLetter) {
        alphabet.remove(guessedLetter);
    }



}