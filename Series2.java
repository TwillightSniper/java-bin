import java.util.*;

class Series2
{
    int x, n, sum;

    void input()
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the value of x: ");
        x = in.nextInt();

        System.out.print("Enter the number of terms: ");
        n = in.nextInt();
    }

    long fact(int num)
    {
        long f = 1;

        for(int i = 1; i <= num; i++)
            f = f * i;

        return f;
    }

    double sum()
    {
        double s = 0;
        int power = 0;
        int den;

        for(int i = 1; i <= n; i++)
        {
            power = power + i;
            den = 2 * i;

            s = s + Math.pow(x, power) / fact(den);
        }

        return s;
    }

    void disp()
    {
        System.out.println("Sum of the Series = " + sum());
    }

    public static void main(String args[])
    {
        Series2 ob = new Series2();

        ob.input();
        ob.disp();
    }
}