import java.util.*;

class pj12
{
    int Sum(int a, int b)
    {
        int sum = 0;
        for(int i = a; i <= b; i++)
        {
            if(i % 2 == 0)
                sum += i;
        }
        return sum;
    }
    double Sum(double n)
    {
        double p = 1.0;
        for(double i = 1.0; i <= n; i += 0.2)
        {
            p *= i;
        }
        return p;
    }
    int Sum(int n)
    {
        int d, sum = 0;
        while(n > 0)
        {
            d = n % 10;
            if(d % 2 != 0)
                sum += d;
            n /= 10;
        }
        return sum;
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        pj12 ob = new pj12();
        System.out.print("Enter a: ");
        int a = in.nextInt();
        System.out.print("Enter b: ");
        int b = in.nextInt();
        System.out.println("Sum of even numbers = " + ob.Sum(a, b));
        System.out.print("Enter n for product series: ");
        double n1 = in.nextDouble();
        System.out.println("product of series = " + ob.Sum(n1));
        System.out.print("Enter an integer: ");
        int n2 = in.nextInt();
        System.out.println("Sum of odd ds = " + ob.Sum(n2));
    }
}