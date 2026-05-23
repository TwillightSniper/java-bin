import java.util.*;

class digfact
{
    int fact(int n)
    {
        int f = 1;

        for(int i = 1; i <= n; i++)
        {
            f = f * i;
        }

        return f;
    }

    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        digfact ob = new digfact();

        System.out.print("Enter a number: ");
        int n = in.nextInt();

        while(n > 0)
        {
            int d = n % 10;
            System.out.println("Factorial of " + d + " = " + ob.fact(d));
            n = n / 10;
        }
    }
}