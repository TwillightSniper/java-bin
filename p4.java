import java.util.Scanner;
class p4 
{
    public static void main(String args[]) 
    {
        Scanner in = new Scanner(System.in);
        int n, a, r = 0;
        n = in.nextInt();
        while (n > 0) {
            a = n % 10;
            r = r * 10 + a;
            n = n / 10;
        }
        System.out.println("reverse=" + r);
    }
}
