import java.util.*;

class ar_min
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);

        int n, i;
        System.out.print("Enter array size: ");
        n = in.nextInt();

        int ar[] = new int[n];

        System.out.println("Enter array elements:");
        for(i = 0; i < n; i++)
        {
            ar[i] = in.nextInt();
        }

        int min = ar[0];

        for(i = 0; i < n; i++)
        {
            if(min > ar[i])
            {
                min = ar[i];
            }
        }

        System.out.println("Min array element = " + min);
    }
}