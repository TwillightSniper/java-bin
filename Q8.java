import java.util.*;

class Q8
{
    String str;
    String newstr;
    int count;

    Q8()
    {
        str = "";
        newstr = "";
        count = 0;
    }

    void accept(String s)
    {
        str = s;
    }

    void rev()
    {
        newstr = "";

        for(int i = str.length() - 1; i >= 0; i--)
            newstr += str.charAt(i);

        System.out.println("Reversed String = " + newstr);
    }

    void freq()
    {
        System.out.println("Character Frequencies:");

        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);

            if(ch == '*')
                continue;

            count = 1;

            for(int j = i + 1; j < str.length(); j++)
            {
                if(ch == str.charAt(j))
                    count++;
            }

            System.out.println(ch + " = " + count);
        }
    }

    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = in.nextLine();

        Q8 ob = new Q8();

        ob.accept(s);
        ob.rev();
        ob.freq();
    }
}