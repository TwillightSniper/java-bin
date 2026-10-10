import java.util.*;

class ts7
{
    void pattern()
    {
        char ch = 'A';

        for(int i = 5; i >= 1; i--)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print(ch + " ");
                ch++;
            }

            System.out.println();
        }
    }

    void pattern(int n)
    {
        int num = n;

        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print(num + " ");
                num = num + 2;
            }

            System.out.println();
        }
    }

    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);

        ts7 ob = new ts7();

        ob.pattern();

        System.out.print("Enter number of rows: ");
        int n = in.nextInt();

        ob.pattern(n);
    }
}