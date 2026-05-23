import java.util.*;

class pn
{
    boolean ip(int n)
    {
        int c = 0;

        for(int i = 1; i <= n; i++)
        {
            if(n % i == 0)
                c++;
        }

        return c == 2;
    }

    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        pn ob = new pn();

        System.out.print("Enter value of n: ");
        int n = in.nextInt();

        int count = 0, num = 2;

        while(count < n)
        {
            if(ob.ip(num))
            {
                System.out.print(num + " ");
                count++;
            }

            num++;
        }
    }
}