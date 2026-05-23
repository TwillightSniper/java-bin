import java.util.*;

class Q9
{
    public static void main(String args [])
    {
        Scanner in = new Scanner(System.in);

        System.out.println("1. Uppercase Z to A");
        System.out.println("2. Lowercase a to z");

        int ch = in.nextInt();

        switch(ch)
        {
            case 1:
            for(char i='Z'; i>='A'; i--)
                System.out.print(i + " ");
            break;

            case 2:
            for(char i='a'; i<='z'; i++)
                System.out.print(i + " ");
            break;
        }
    }
}