import java.util.*;

class Q10
{
    public static void main(String args [])
    {
        Scanner in = new Scanner(System.in);

        int ch = in.nextInt();

        switch(ch)
        {
            case 1:
            for(char c='A'; c<='E'; c++)
                System.out.print(c + " ");
            break;

            case 2:
            for(char c='v'; c<='z'; c++)
                System.out.print(c + " ");
            break;
        }

    }
}