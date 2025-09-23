import java.util.Scanner;
class p2 
{
    public static void main(String args[]) 
    {
        Scanner in = new Scanner(System.in);
        int n, a, c = 0;
        n = in.nextInt();
        while (n != 0) {
            a = n % 10;
            c++;
            n = n / 10;
        }
        System.out.println("No. of digits=" + c);
    }
}
