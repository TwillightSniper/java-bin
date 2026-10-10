import java.util.*;

class ar_splitoddeven
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);

        int i;
        int ar[] = new int[10];

        System.out.println("Enter array elements:");
        for(i = 0; i < 10; i++)
        {
            ar[i] = in.nextInt();
        }

        int ev[] = new int[10];
        int od[] = new int[10];

        int ei = 0, oi = 0;

        for(i = 0; i < 10; i++)
        {
            if(ar[i] % 2 == 0)
            {
                ev[ei] = ar[i];
                ei++;
            }
            else
            {
                od[oi] = ar[i];
                oi++;
            }
        }

        System.out.println("Even elements = ");
        for(i = 0; i < ei; i++)
        {
            System.out.print(ev[i] + " ");
        }

        System.out.println();

        System.out.println("Odd elements = ");
        for(i = 0; i < oi; i++)
        {
            System.out.print(od[i] + " ");
        }
    }
}