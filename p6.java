import java.util.Scanner;
class p6 
{
    public static void main(String args[]) 
    {
        Scanner in = new Scanner(System.in);
        int n, a, r = 0;
        n = in.nextInt();
        for (; n > 0; n = n / 10) {
            a = n % 10;
            r = r * 10 + a;
        }
        System.out.println("reverse=" + r);
    }
}
