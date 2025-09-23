import java.util.Scanner;
class p1 
{
    public static void main(String args[]) 
    {
        Scanner in = new Scanner(System.in);
        int n, a, s = 0, p = 1;
        n = in.nextInt();
        while (n > 0) {
            a = n % 10;
            if (a % 2 == 0)
                s = s + a;
            else
                p = p * a;
            n = n / 10;
        }
        System.out.println("sum of even=" + s);
        System.out.println("product of odd=" + p);
    }
}
