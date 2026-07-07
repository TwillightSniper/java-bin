import java.util.*;

class pj10
{
    double series(double n)
    {
        double sum = 0;

        for(int i = 1; i <= (int)n; i++)
        {
            sum = sum + 1.0 / i;
        }

        return sum;
    }
    double series(double a, double n)
    {
        double sum = 0;
        int num = 1;
        int power = 2;
        for(int i = 1; i <= (int)n; i++)
        {
            sum = sum + (double)num / Math.pow(a, power);
            num += 3;
            power += 3;
        }
        return sum;
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        pj10 ob = new pj10();
        System.out.print("Enter value of n for first series: ");
        double n = in.nextDouble();
        System.out.println("Sum of first series = " + ob.series(n));
        System.out.print("\nEnter value of a: ");
        double a = in.nextDouble();
        System.out.print("Enter number of terms: ");
        double terms = in.nextDouble();
        System.out.println("Sum of second series = " + ob.series(a, terms));
    }
}