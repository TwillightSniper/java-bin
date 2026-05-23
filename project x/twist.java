import java.util.*;
class twist
 {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int t = n;

        int last = n % 10;
        while (n >= 10) n /= 10;
        int first = n;

        if (first % 2 == 0 && last % 2 == 1)
            System.out.println(t + " is Twist");
        else
            System.out.println(t + " is not Twist");
    }
}
