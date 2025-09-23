import java.util.Scanner;
class p3 
{
    public static void main(String args[]) 
    {
        Scanner in = new Scanner(System.in);
        int n, a, s = 0, m;
        n = in.nextInt();
        m = n;
        while (n > 0) {
            a = n % 10;
            s = s + (a * a * a);
            n = n / 10;
        }
        if (m == s)
            System.out.println("armstrong");
        else
            System.out.println("not armstrong");
    }
}
