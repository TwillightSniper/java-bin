import java.util.*;
class disarium
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = in.nextInt();

        int temp = n;

        int count = 0, a = n;
        while(a > 0)
        {
            count++;
            a /= 10;
        }

        int sum = 0, d;
        a = n;
        while(a > 0)
        {
            d = a % 10;
            sum += Math.pow(d, count);
            count--;
            a /= 10;
        }

        if(sum == temp)
            System.out.println(temp + " is a Disarium number");
        else
            System.out.println(temp + " is not a Disarium number");
    }
}
