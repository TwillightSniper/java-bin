import java.util.*;

class Q11
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);

        System.out.println("1. A to Z");
        System.out.println("2. z to a");

        int ch = in.nextInt();

        switch(ch)
        {
            case 1:
            for(char c='A'; c<='Z'; c++)
                System.out.println(c + " = " + (int)c);
            break;

            case 2:
            for(char c='z'; c>='a'; c--)
                System.out.println(c + " = " + (int)c);
            break;
        }

    }
}