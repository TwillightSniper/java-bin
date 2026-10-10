import java.util.*;

class Qu5
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        String s, word;
        int i;
        System.out.print("Enter a sentence: ");
        s = in.nextLine();
        s = s + " ";
        word = "";
        for(i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) != ' ')
            {
                word = word + s.charAt(i);
            }
            else
            {
                if(word.length() > 0)
                {
                    char first = Character.toUpperCase(word.charAt(0));
                    char last = Character.toUpperCase(word.charAt(word.length() - 1));

                    if((first=='A'||first=='E'||first=='I'||first=='O'||first=='U')&&(last=='A'||last=='E'||last=='I'||last =='O'||last=='U'))
                    {
                        System.out.println(word);
                    }
                }

                word = "";
            }
        }
    }
}