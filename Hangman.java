import java.util.*;

class Hangman
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);

        String words[] = {
            "computer", "minecraft", "keyboard", "elephant", "guitar",
            "school", "rainbow", "programming", "football", "butterfly",
            "tiger", "dragon", "castle", "pencil", "notebook",
            "teacher", "student", "library", "science", "history",
            "planet", "galaxy", "rocket", "spaceship", "asteroid",
            "volcano", "mountain", "ocean", "island", "forest",
            "jungle", "desert", "thunder", "lightning", "snowflake",
            "sunshine", "moonlight", "adventure", "mystery", "treasure",
            "pirate", "wizard", "knight", "princess", "monster",
            "vampire", "zombie", "robot", "android", "dragon",
            "penguin", "dolphin", "shark", "whale", "octopus",
            "crocodile", "giraffe", "kangaroo", "panda", "cheetah",
            "leopard", "rabbit", "hamster", "squirrel", "parrot",
            "eagle", "sparrow", "peacock", "butterfly", "spider",
            "flower", "garden", "sunflower", "rose", "laptop",
            "television", "headphones", "camera", "internet", "website",
            "password", "keyboard", "battery", "telephone", "music",
            "guitar", "piano", "drums", "violin", "movie",
            "cartoon", "superhero", "football", "basketball", "cricket",
            "tennis", "badminton", "swimming", "cycling", "skating"};

        Random r = new Random();

        String word = words[r.nextInt(words.length)];
        String display = "";
        int chances = 6;
        boolean found;
        char ch;

        for(int i = 0; i < word.length(); i++)
            display += "_";

        System.out.println("===== HANGMAN =====");
        System.out.println("Guess the word!");

        while(chances > 0 && !display.equals(word))
        {
            System.out.println("\nWord: " + display);
            System.out.println("Chances left: " + chances);
            System.out.print("Enter a letter: ");

            String guess = in.nextLine().toLowerCase();

            if(guess.length() != 1)
            {
                System.out.println("Enter only one letter!");
                continue;
            }

            ch = guess.charAt(0);
            found = false;

            for(int i = 0; i < word.length(); i++)
            {
                if(word.charAt(i) == ch)
                {
                    display = display.substring(0, i) + ch
                            + display.substring(i + 1);
                    found = true;
                }
            }

            if(found)
                System.out.println("Good guess!");
            else
            {
                chances--;
                System.out.println("Wrong guess!");
            }
        }

        if(display.equals(word))
            System.out.println("\nYou won!");
        else
            System.out.println("\nGame Over!");

        System.out.println("The word was: " + word);
    }
}