import java.util.*;

class Factor
{
    void fact(int n)
    {
        int i;
        for(i = 2; i < n; i++)
        {
            if(n % i == 0)
            {
                System.out.println("First factor: " + i);

                System.out.println("Second factor: " + (n / i));
                break;
            }
        }
    }
    public static void main()
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = in.nextInt();

        Factor ob = new Factor();

        ob.fact(n);
    }
}