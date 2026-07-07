import java.util.*;
class firstchar
{
    public static void main (String args [])
    {
        Scanner in = new Scanner (System.in);
        System.out.println ("Enter a string:");
        String s = in.nextLine();
        s=" " +s;
        String nw = "";
        
        for (int i = 0; i < s.length() - 1;i++)
        {
            if (s.charAt(i) == ' ' && s.charAt(i+1) != ' ')
            {
                nw = nw + s.charAt(i+1);
            }
        }
        System.out.println(nw);
    }
}