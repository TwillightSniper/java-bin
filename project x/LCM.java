import java.util.*;

class LCM
{
    int gcd(int a, int b)
    {
        while(b != 0)
        {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
    void lcm(int a, int b)
    {
        int gcd = gcd(a, b);
        int lcm = (a * b) / gcd;
        System.out.println("LCM = " + lcm);
    }

    public static void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();
        LCM ob = new LCM();
        ob.lcm(a, b);
    }
}