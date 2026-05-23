import java.util.*;
class Lead 
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int t = n;

        int se = 0, so = 0;

        while (n != 0) {
            int d = n % 10;
            if (d % 2 == 0) se += d;
            else so += d;
            n /= 10;
        }

        if (se == so)
            System.out.println(t + " is Lead");
        else
            System.out.println(t + " is not Lead");
    }
}
