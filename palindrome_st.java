import java.util.*;
class palindrome_st
{
    public static void main (String args [])
    {
        Scanner in = new Scanner (System.in);
        System.out.println ("Enter a string:");
        String s = in.nextLine();
        String word = "";
        String rev = "";
        s=s+" ";
        for (int i = 0; i < s.length() ; i++)
        {
            char ch = s.charAt(i);
            if (ch != ' ')
            {
                word = word+ch;
                rev=ch+rev;
            }
            else
            {
                if (word.equals(rev))
                {
                    System.out.println(rev);
                }
                word = "";
                rev = "";
            }
        }
    }
}