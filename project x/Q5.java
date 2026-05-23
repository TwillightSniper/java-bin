import java.util.*;
class Q5
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        char ch;
        int s = 0;

        System.out.print("Enter command: ");
        ch = in.next().charAt(0);

        if(ch == 's')
        {
            System.out.println("The engine started!");
            while(true)
            {
                ch = in.next().charAt(0);

                if(ch == 'a')
                {
                    s += 10;
                    System.out.println("Speed increased!");
                }
                else if(ch == 'd')
                {
                    s -= 5;
                    if(s < 0)
                        s = 0;
                    System.out.println("Speed decreased!");
                }
                else if(ch == 's')
                {
                    System.out.println("The engine stopped! Final speed: " + s + " units.");
                    break;
                }
            }
        }
        else
            System.out.println("Engine not started");
    }
}
