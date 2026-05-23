import java.util.*;
class micro
 {
    public static void main(String args[]) 
    {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int t = n;
        int flag = 0;

        while (n != 0) {
            int d = n % 10;
            if (d % 2 == 0)
                flag = 1;
            n /= 10;
        }

        if (flag == 1)
            System.out.println(t + " is Mirra");
        else
            System.out.println(t + " is not Mirra");
    }
}
