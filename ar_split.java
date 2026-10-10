import java.util.*;

class ar_split
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);

        int n, i, ib = 0;

        System.out.print("Enter size of the array: ");
        n = in.nextInt();

        int ar[] = new int[n];

        int a[] = new int[(n / 2) + 1];
        int b[] = new int[n / 2];

        System.out.println("Enter array elements:");
        for(i = 0; i < n; i++)
        {
            ar[i] = in.nextInt();
        }

        for(i = 0; i < a.length; i++)
        {
            a[i] = ar[i];
        }

        ib = 0;
        for(i = a.length; i < n; i++)
        {
            b[ib] = ar[i];
            ib++;
        }

        System.out.println("First half:");
        for(i = 0; i < a.length; i++)
        {
            System.out.print(a[i] + " ");
        }

        System.out.println();

        System.out.println("Second half:");
        for(i = 0; i < b.length; i++)
        {
            System.out.print(b[i] + " ");
        }
    }
}