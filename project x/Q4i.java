import java.util.*;
class Q4i
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n, i, sum = 0;

        System.out.print("Enter number: ");
        n = in.nextInt();

        for(i = 1; i <= n / 2; i++)
        {
            if(n % i == 0)
                sum += i;
        }

        if(sum > n)
            System.out.println("Abundant Number");
        else
            System.out.println("Not an Abundant Number");
    }
}
