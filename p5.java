import java.util.Scanner;
class p5
 {
    public static void main(String args[]) 
    {
        Scanner in = new Scanner(System.in);
        int n, a, r = 0, m;
        n = in.nextInt();
        m = n;
        while (n > 0) {
            a = n % 10;
            r = r * 10 + a;
            n = n / 10;
        }
        if (m == r)
            System.out.println("palindrome");
        else
            System.out.println("not palindrome");
    }
}
