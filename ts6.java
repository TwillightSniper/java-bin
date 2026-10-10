import java.util.*;

class ts6
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = in.nextInt();

        int temp = n;
        int ds = 0;
        int sum = 0;

        while(temp > 0)
        {
            ds++;
            temp = temp / 10;
        }

        temp = n;

        while(temp > 0)
        {
            int d = temp % 10;
            int p = 1;

            for(int i = 1; i <= ds; i++)
                p = p * d;

            sum = sum + p;
            temp = temp / 10;
        }

        if(sum == n)
            System.out.println("Special Armstrong Number");
        else
            System.out.println("Not a Special Armstrong Number");
    }
}