import java.util.*;

class ts5
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String s = in.nextLine();
        s = s + " ";

        String word = "";
        String s1 = "AEIOUaeiou";

        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);

            if(ch != ' ')
                word = word + ch;
            else
            {
                if(word.length() > 0)
                {
                    char first = word.charAt(0);
                    char last = word.charAt(word.length() - 1);

                    if(s1.indexOf(first) >= 0 && s1.indexOf(last) >= 0)
                        System.out.println(word);
                }

                word = "";
            }
        }
    }
}