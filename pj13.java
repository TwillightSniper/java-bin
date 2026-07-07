import java.util.*;

class pj13
{
    void s1(int x, int n)
    {
        double sum = 0;

        for(int i = 1; i <= n; i++)
        {
            sum = sum + Math.pow(x, i);
        }

        System.out.println("Sum = " + sum);
    }
    void s2(int p)
    {
        for(int i = 1; i <= p; i++)
        {
            int term = (int)Math.pow(i, 3) - 1;
            System.out.print(term + " ");
        }
        System.out.println();
    }
    void s3()
    {
        double sum = 0;

        for(int i = 2; i <= 10; i++)
        {
            sum = sum + (1.0 / i);
        }

        System.out.println("Sum = " + sum);
    }

    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        pj13 ob = new pj13();
        System.out.print("Enter values for x and n: ");
        int x = in.nextInt();
        int n = in.nextInt();
        System.out.print("Enter value for p: ");
        int p = in.nextInt();
        System.out.println("Sum of fractional series:");
        ob.s1(x, n);
        ob.s2(p);
        ob.s3();
    }
}