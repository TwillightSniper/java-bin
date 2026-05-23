import java.util.*;

class Series
{
    double series(double n)
    {
        double sum = 0;

        for(int i = 1; i <= n; i++)
        {
            sum = sum + 1.0 / i;
        }

        return sum;
    }

    double series(double a, double n)
    {
        double sum = 0;

        for(int i = 1; i <= n; i++)
        {
            int power = 2 * i + 1;
            sum = sum + (double)(3 * i - 2) / Math.pow(a, power);
        }

        return sum;
    }

    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        Series ob = new Series();

        System.out.print("Enter n: ");
        double n = in.nextDouble();

        double s1 = ob.series(n);
        System.out.println("Sum of first series = " + s1);

        System.out.print("Enter a and n: ");
        double a = in.nextDouble();
        double n2 = in.nextDouble();

        double s2 = ob.series(a, n2);
        System.out.println("Sum of second series = " + s2);
    }
}