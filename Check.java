import java.util.*;

class Check
{
    void check(int n)
    {
        int d, c = 0, temp = n;

        while(temp > 0)
        {
            d = temp % 10;
            temp = temp / 10;

            int t = temp;

            while(t > 0)
            {
                if(d == t % 10)
                    c++;

                t = t / 10;
            }
        }

        if(c == 0)
            System.out.println("Unique Number");
        else
            System.out.println("Not a Unique Number");
    }

    int check(int a, int b)
    {
        int c1[] = new int[10];
        int c2[] = new int[10];

        while(a > 0)
        {
            c1[a % 10]++;
            a = a / 10;
        }

        while(b > 0)
        {
            c2[b % 10]++;
            b = b / 10;
        }

        for(int i = 0; i < 10; i++)
        {
            if(c1[i] != c2[i])
                return 0;
        }

        return 1;
    }

    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        Check ob = new Check();

        System.out.print("Enter a number: ");
        int n = in.nextInt();
        ob.check(n);

        System.out.print("Enter two numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();

        int x = ob.check(a, b);

        if(x == 1)
            System.out.println("Numbers are formed using same digits");
        else
            System.out.println("Numbers are not formed using same digits");
    }
}