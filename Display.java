import java.util.*;

class Display
{
    int display(int n)
    {
        int sum = 0;

        for(int i = 1; i <= n; i++)
        {
            sum = sum + (i * 10 + 1);
        }

        return sum;
    }

    int display(int x, int n)
    {
        int sum = 0;

        for(int i = 1; i <= n; i++)
        {
            sum = sum + (x + 2 * i);
        }

        return sum;
    }

    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        Display ob = new Display();

        System.out.print("Enter n for first series: ");
        int n1 = in.nextInt();

        int s1 = ob.display(n1);
        System.out.println("Sum = " + s1);

        System.out.print("Enter x and n for second series: ");
        int x = in.nextInt();
        int n2 = in.nextInt();

        int s2 = ob.display(x, n2);
        System.out.println("Sum = " + s2);
    }
}